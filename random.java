package lotd;

import java.io.*;
import java.lang.*;
import java.util.*;

import javax.swing.JOptionPane;

public class random
{
	private Formatter temp;
	private Scanner cardreader;
	private String selectedcard;
	private int number;
	private Random rand = new Random();

	public void generate(int cw, int sw, int iw, int ew, int cb, int sb, int ib, int eb, int cu, int su, int iu, int eu, int cr, int sr, int ir, int er, int cg, int sg, int ig, int eg)
	{
		try
		{
			temp = new Formatter("deck.temp");
		}
		catch (FileNotFoundException e1)
		{
			JOptionPane.showMessageDialog(null,"Read or write permission error.","Error",JOptionPane.ERROR_MESSAGE);
		}
		if(cw>0)
		{
			while(cw>0)
			{
				try
				{
					cardreader = new Scanner(new File("Cards/Creature-White.txt"));
				}
				catch (FileNotFoundException e1)
				{
					JOptionPane.showMessageDialog(null,"Read or write permission error.","Error",JOptionPane.ERROR_MESSAGE);
				}
				number = rand.nextInt(132);
				cw = cw - 1;
				while(number>0)
				{
					cardreader.nextLine();
					number = number - 1;
				}
				selectedcard = cardreader.nextLine();
				temp.format("%s%n", selectedcard);
				cardreader.close();
			}
		}
		if(sw>0)
		{
			while(sw>0)
			{
				try
				{
					cardreader = new Scanner(new File("Cards/Sorcery-White.txt"));
				}
				catch (FileNotFoundException e1)
				{
					JOptionPane.showMessageDialog(null,"Read or write permission error.","Error",JOptionPane.ERROR_MESSAGE);
				}
				number = rand.nextInt(15);
				sw = sw - 1;
				while(number>0)
				{
					cardreader.nextLine();
					number = number - 1;
				}
				selectedcard = cardreader.nextLine();
				temp.format("%s%n", selectedcard);
				cardreader.close();
			}
		}
		if(iw>0)
		{
			while(iw>0)
			{
				try
				{
					cardreader = new Scanner(new File("Cards/Instant-White.txt"));
				}
				catch (FileNotFoundException e1)
				{
					JOptionPane.showMessageDialog(null,"Read or write permission error.","Error",JOptionPane.ERROR_MESSAGE);
				}
				number = rand.nextInt(15);
				iw = iw - 1;
				while(number>0)
				{
					cardreader.nextLine();
					number = number - 1;
				}
				selectedcard = cardreader.nextLine();
				temp.format("%s%n", selectedcard);
				cardreader.close();
			}
		}
		if(ew>0)
		{
			while(ew>0)
			{
				try
				{
					cardreader = new Scanner(new File("Cards/Enchantment-White.txt"));
				}
				catch (FileNotFoundException e1)
				{
					JOptionPane.showMessageDialog(null,"Read or write permission error.","Error",JOptionPane.ERROR_MESSAGE);
				}
				number = rand.nextInt(28);
				ew = ew - 1;
				while(number>0)
				{
					cardreader.nextLine();
					number = number - 1;
				}
				selectedcard = cardreader.nextLine();
				temp.format("%s%n", selectedcard);
				cardreader.close();
			}
		}
		if(cb>0)
		{
			while(cb>0)
			{
				try
				{
					cardreader = new Scanner(new File("Cards/Creature-Black.txt"));
				}
				catch (FileNotFoundException e1)
				{
					JOptionPane.showMessageDialog(null,"Read or write permission error.","Error",JOptionPane.ERROR_MESSAGE);
				}
				number = rand.nextInt(129);
				cb = cb - 1;
				while(number>0)
				{
					cardreader.nextLine();
					number = number - 1;
				}
				selectedcard = cardreader.nextLine();
				temp.format("%s%n", selectedcard);
				cardreader.close();
			}
		}
		if(sb>0)
		{
			while(sb>0)
			{
				try
				{
					cardreader = new Scanner(new File("Cards/Sorcery-Black.txt"));
				}
				catch (FileNotFoundException e1)
				{
					JOptionPane.showMessageDialog(null,"Read or write permission error.","Error",JOptionPane.ERROR_MESSAGE);
				}
				number = rand.nextInt(48);
				sb = sb - 1;
				while(number>0)
				{
					cardreader.nextLine();
					number = number - 1;
				}
				selectedcard = cardreader.nextLine();
				temp.format("%s%n", selectedcard);
				cardreader.close();
			}
		}
		if(ib>0)
		{
			while(ib>0)
			{
				try
				{
					cardreader = new Scanner(new File("Cards/Instant-Black.txt"));
				}
				catch (FileNotFoundException e1)
				{
					JOptionPane.showMessageDialog(null,"Read or write permission error.","Error",JOptionPane.ERROR_MESSAGE);
				}
				number = rand.nextInt(22);
				ib = ib - 1;
				while(number>0)
				{
					cardreader.nextLine();
					number = number - 1;
				}
				selectedcard = cardreader.nextLine();
				temp.format("%s%n", selectedcard);
				cardreader.close();
			}
		}
		if(eb>0)
		{
			while(eb>0)
			{
				try
				{
					cardreader = new Scanner(new File("Cards/Enchantment-Black.txt"));
				}
				catch (FileNotFoundException e1)
				{
					JOptionPane.showMessageDialog(null,"Read or write permission error.","Error",JOptionPane.ERROR_MESSAGE);
				}
				number = rand.nextInt(29);
				eb = eb - 1;
				while(number>0)
				{
					cardreader.nextLine();
					number = number - 1;
				}
				selectedcard = cardreader.nextLine();
				temp.format("%s%n", selectedcard);
				cardreader.close();
			}
		}
		
	}
	public void close()
	{
		temp.close();
		cardreader.close();
	}
}