package com.helloWorldButSWT;

import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * Created by student on 26.02.2018.
 */
public class hOI {
    public static void main (String[] argv)
    {
        Display display = new Display();

        Shell shell = new Shell(display);

        shell.setLayout(new FillLayout());

        shell.open();
        while (!shell.isDisposed())
        {
            if (!display.readAndDispatch())
            {
                display.sleep();
            }
        }
        display.dispose();
    }
}
