package com.helloWorldSWT32bit;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Created by student on 26.02.2018.
 */
public class hOI {
    public static void main(String[] argv)
    {
        Display display = new Display();

        Shell shell = new Shell(display);

        shell.setLayout(new FillLayout());

        Label label = new Label(shell, SWT.BORDER);
        label.setText("hOIIIIII! I'm TEMMIE!");
        label.setToolTipText("And dis is my friend: TEMMIE!!");

        Text text = new Text(shell, SWT.NONE);
        text.setText("Hi. My name is Bob.");
        text.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
        text.setForeground(display.getSystemColor(SWT.COLOR_WHITE));


        text.pack();
        label.pack();
        
        shell.open();
        while(!shell.isDisposed())
        {
            if (!display.readAndDispatch())
            {
                display.sleep();
            }
        }

        display.dispose();
    }
}
