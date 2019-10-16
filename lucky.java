package lotd;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class lucky extends JFrame
{
	private JButton buildbutton;
	private buildhandler buildlistener;

	private JLabel cwlb, swlb, iwlb, ewlb, cblb, sblb, iblb, eblb, culb, sulb, iulb, eulb, crlb, srlb, irlb, erlb, cglb, sglb, iglb, eglb, namelb;

	private JTextField cwtxt, swtxt, iwtxt, ewtxt, cbtxt, sbtxt, ibtxt, ebtxt, cutxt, sutxt, iutxt, eutxt, crtxt, srtxt, irtxt, ertxt, cgtxt, sgtxt, igtxt, egtxt, nametxt;

	public int cw, sw, iw, ew, cb, sb, ib, eb, cu, su, iu, eu, cr, sr, ir, er, cg, sg, ig, eg, wl, bl, ul, rl, gl;
	public String name;

	public lucky()
	{
		Container luckylayout = getContentPane();
		luckylayout.setLayout(new GridLayout(22, 2));

		buildbutton = new JButton("Build!");
		cwtxt = new JTextField(1);
		cwtxt.setText("0");
		cwtxt.setHorizontalAlignment(JTextField.CENTER);
		swtxt = new JTextField(1);
		swtxt.setHorizontalAlignment(JTextField.CENTER);
		swtxt.setText("0");
		iwtxt = new JTextField(1);
		iwtxt.setHorizontalAlignment(JTextField.CENTER);
		iwtxt.setText("0");
		ewtxt = new JTextField(1);
		ewtxt.setHorizontalAlignment(JTextField.CENTER);
		ewtxt.setText("0");
		cbtxt = new JTextField(1);
		cbtxt.setHorizontalAlignment(JTextField.CENTER);
		cbtxt.setText("0");
		sbtxt = new JTextField(1);
		sbtxt.setHorizontalAlignment(JTextField.CENTER);
		sbtxt.setText("0");
		ibtxt = new JTextField(1);
		ibtxt.setHorizontalAlignment(JTextField.CENTER);
		ibtxt.setText("0");
		ebtxt = new JTextField(1);
		ebtxt.setHorizontalAlignment(JTextField.CENTER);
		ebtxt.setText("0");
		cutxt = new JTextField(1);
		cutxt.setHorizontalAlignment(JTextField.CENTER);
		cutxt.setText("0");
		sutxt = new JTextField(1);
		sutxt.setHorizontalAlignment(JTextField.CENTER);
		sutxt.setText("0");
		iutxt = new JTextField(1);
		iutxt.setHorizontalAlignment(JTextField.CENTER);
		iutxt.setText("0");
		eutxt = new JTextField(1);
		eutxt.setHorizontalAlignment(JTextField.CENTER);
		eutxt.setText("0");
		crtxt = new JTextField(1);
		crtxt.setHorizontalAlignment(JTextField.CENTER);
		crtxt.setText("0");
		srtxt = new JTextField(1);
		srtxt.setHorizontalAlignment(JTextField.CENTER);
		srtxt.setText("0");
		irtxt = new JTextField(1);
		irtxt.setHorizontalAlignment(JTextField.CENTER);
		irtxt.setText("0");
		ertxt = new JTextField(1);
		ertxt.setHorizontalAlignment(JTextField.CENTER);
		ertxt.setText("0");
		cgtxt = new JTextField(1);
		cgtxt.setHorizontalAlignment(JTextField.CENTER);
		cgtxt.setText("0");
		sgtxt = new JTextField(1);
		sgtxt.setHorizontalAlignment(JTextField.CENTER);
		sgtxt.setText("0");
		igtxt = new JTextField(1);
		igtxt.setHorizontalAlignment(JTextField.CENTER);
		igtxt.setText("0");
		egtxt = new JTextField(1);
		egtxt.setHorizontalAlignment(JTextField.CENTER);
		egtxt.setText("0");
		nametxt = new JTextField(1);
		nametxt.setHorizontalAlignment(JTextField.CENTER);
		nametxt.setText("Name");

		cwlb = new JLabel("White Creature Cards:", SwingConstants.CENTER);
		swlb = new JLabel("White Sorcery Cards:", SwingConstants.CENTER);
		iwlb = new JLabel("White Instant Cards:", SwingConstants.CENTER);
		ewlb = new JLabel("White Enchantment Cards:", SwingConstants.CENTER);
		cblb = new JLabel("Black Creature Cards:", SwingConstants.CENTER);
		sblb = new JLabel("Black Sorcery Cards:", SwingConstants.CENTER);
		iblb = new JLabel("Black Instant Cards:", SwingConstants.CENTER);
		eblb = new JLabel("Black Enchantment Cards:", SwingConstants.CENTER);
		culb = new JLabel("Blue Creature Cards:", SwingConstants.CENTER);
		sulb = new JLabel("Blue Sorcery Cards:", SwingConstants.CENTER);
		iulb = new JLabel("Blue Instant Cards:", SwingConstants.CENTER);
		eulb = new JLabel("Blue Enchantment Cards:", SwingConstants.CENTER);
		crlb = new JLabel("Red Creature Cards:", SwingConstants.CENTER);
		srlb = new JLabel("Red Sorcery Cards:", SwingConstants.CENTER);
		irlb = new JLabel("Red Instant Cards:", SwingConstants.CENTER);
		erlb = new JLabel("Red Enchantment Cards:", SwingConstants.CENTER);
		cglb = new JLabel("Green Creature Cards:", SwingConstants.CENTER);
		sglb = new JLabel("Green Sorcery Cards:", SwingConstants.CENTER);
		iglb = new JLabel("Green Instant Cards:", SwingConstants.CENTER);
		eglb = new JLabel("Green Enchantment Cards:", SwingConstants.CENTER);
		namelb = new JLabel("Deck Name:", SwingConstants.CENTER);


		buildlistener = new buildhandler();

		buildbutton.addActionListener(buildlistener);

		luckylayout.add(cwlb);
		luckylayout.add(cwtxt);
		luckylayout.add(swlb);
		luckylayout.add(swtxt);
		luckylayout.add(iwlb);
		luckylayout.add(iwtxt);
		luckylayout.add(ewlb);
		luckylayout.add(ewtxt);
		luckylayout.add(cblb);
		luckylayout.add(cbtxt);
		luckylayout.add(sblb);
		luckylayout.add(sbtxt);
		luckylayout.add(iblb);
		luckylayout.add(ibtxt);
		luckylayout.add(eblb);
		luckylayout.add(ebtxt);
		luckylayout.add(culb);
		luckylayout.add(cutxt);
		luckylayout.add(sulb);
		luckylayout.add(sutxt);
		luckylayout.add(iulb);
		luckylayout.add(iutxt);
		luckylayout.add(eulb);
		luckylayout.add(eutxt);
		luckylayout.add(crlb);
		luckylayout.add(crtxt);
		luckylayout.add(srlb);
		luckylayout.add(srtxt);
		luckylayout.add(irlb);
		luckylayout.add(irtxt);
		luckylayout.add(erlb);
		luckylayout.add(ertxt);
		luckylayout.add(cglb);
		luckylayout.add(cgtxt);
		luckylayout.add(sglb);
		luckylayout.add(sgtxt);
		luckylayout.add(iglb);
		luckylayout.add(igtxt);
		luckylayout.add(eglb);
		luckylayout.add(egtxt);
		luckylayout.add(namelb);
		luckylayout.add(nametxt);
		luckylayout.add(buildbutton);

		setTitle("Luck of the draw");
		setSize(350, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);
	}
	private class buildhandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) throws NumberFormatException
		{
			try
			{
				cw = Integer.parseInt(cwtxt.getText());
				sw = Integer.parseInt(swtxt.getText());
				iw = Integer.parseInt(iwtxt.getText());
				ew = Integer.parseInt(iwtxt.getText());
				cb = Integer.parseInt(cbtxt.getText());
				sb = Integer.parseInt(sbtxt.getText());
				ib = Integer.parseInt(ibtxt.getText());
				eb = Integer.parseInt(ebtxt.getText());
				cu = Integer.parseInt(cutxt.getText());
				su = Integer.parseInt(sutxt.getText());
				iu = Integer.parseInt(iutxt.getText());
				eu = Integer.parseInt(eutxt.getText());
				cr = Integer.parseInt(crtxt.getText());
				sr = Integer.parseInt(srtxt.getText());
				ir = Integer.parseInt(irtxt.getText());
				er = Integer.parseInt(ertxt.getText());
				cg = Integer.parseInt(cgtxt.getText());
				sg = Integer.parseInt(sgtxt.getText());
				ig = Integer.parseInt(igtxt.getText());
				eg = Integer.parseInt(egtxt.getText());
				name = nametxt.getText();
			}
			catch (NumberFormatException e1)
			{
				JOptionPane.showMessageDialog(null,"Please only put in real numbers and a name.","Error",JOptionPane.ERROR_MESSAGE);
			}
			wl = (cw + sw + iw + ew)/3;
			bl = (cb + sb + ib + eb)/3;
			ul = (cu + su + iu + eu)/3;
			rl = (cr + sr + ir + er)/3;
			gl = (cg + sg + ig + eg)/3;
			
			build b = new build();
			random r = new random();
			r.generate(cw, sw, iw, ew, cb, sb, ib, eb, cu, su, iu, eu, cr, sr, ir, er, cg, sg, ig, eg);
			r.close();
			b.createdeck(name);
			b.writexml(name, wl, bl, ul, rl, gl);
			b.closedeck();

		}

	}
	public static void main(String[] args)
	{
		lucky luckywindow = new lucky();
	}
}