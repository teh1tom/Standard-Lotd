package lotd;

import java.io.*;
import java.lang.*;
import java.util.*;

import javax.swing.JOptionPane;

public class build 
{
	private Scanner cardreader;
	private Formatter deck;
	private int number;
	private Random rand = new Random();
	
	public void createdeck(String name)
	{
		try
		{
			cardreader = new Scanner(new File("deck.temp"));
			deck = new Formatter(name+".cod");
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"Read or write permission error.","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
	public void writexml(String name, int wl, int bl, int ul, int rl, int gl)
	{
		deck.format("%s%n", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		deck.format("%s%n", "<cockatrice_deck version=\"1\">");
		deck.format("%s%s%s%n", "    <deckname>", name, "</deckname>");
		deck.format("%s%n", "    <comments>This deck was generated with \"Luck of the draw\"</comments>");
		deck.format("%s%n", "    <zone name=\"main\">");
		while(cardreader.hasNext())
		{
			String card = cardreader.nextLine();
			number = 1+rand.nextInt(4);
			deck.format("%s%s%s%s%s%n", "        <card number=\"", number, "\" price=\"0\" name=\"", card, "\"/>");
		}
		if(wl>0)
		{
			deck.format("%s%s%s%n", "        <card number=\"", Integer.toString(wl), "\" price=\"0\" name=\"Plains\"/>");
		}
		if(bl>0)
		{
			deck.format("%s%s%s%n", "        <card number=\"", Integer.toString(bl), "\" price=\"0\" name=\"Swamp\"/>");
		}
		if(ul>0)
		{
			deck.format("%s%s%s%n", "        <card number=\"", Integer.toString(ul), "\" price=\"0\" name=\"Island\"/>");
		}
		if(rl>0)
		{
			deck.format("%s%s%s%n", "        <card number=\"", Integer.toString(rl), "\" price=\"0\" name=\"Mountain\"/>");
		}
		if(gl>0)
		{
			deck.format("%s%s%s%n", "        <card number=\"", Integer.toString(gl), "\" price=\"0\" name=\"Forest\"/>");
		}
		deck.format("%s%n", "    </zone>");
		deck.format("%s", "</cockatrice_deck>");
	}
	public void closedeck()
	{
		deck.close();
		cardreader.close();
		JOptionPane.showMessageDialog(null,"Deck completed! \n Please note that if you use any more than 100 cards that the title effects the ability to show the cards so the shorter the better.","Finished",JOptionPane.WARNING_MESSAGE);
	}
}