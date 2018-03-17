package com.testProgram;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.*;


public class Program {
    public static void main(String argv[])
    {
        /* this is display and shell for main window */
        Display mainDisplay = new Display();
        Shell mainShell = new Shell(mainDisplay);

        /* this is layout with specs for main window */
        GridLayout mainGridLayout = new GridLayout(10,true);
        mainGridLayout.horizontalSpacing = 10;
        mainGridLayout.marginBottom = 20;
        mainGridLayout.marginTop = 15;
        mainGridLayout.marginWidth = 10;

        /* setting layout for main shell */
        mainShell.setLayout(mainGridLayout);

        /* grid data for the blocks */
        GridData gridBlock = new GridData(SWT.FILL, SWT.FILL, true, true);
        gridBlock.horizontalSpan = 2;

        /* grid data for 2-column elements */
        GridData doubleColumnElem = new GridData (SWT.FILL, SWT.FILL, true, false);
        doubleColumnElem.horizontalSpan = 2;

        Group block1 = new Group(mainShell, SWT.NONE);
        block1.setText("Block 1");
        block1.setLayoutData(gridBlock);
        block1.setLayout(new GridLayout(2, true));
        Text inputLineB1 = new Text(block1, SWT.NONE);
        inputLineB1.setLayoutData(doubleColumnElem);
        Button addToComboB1 = new Button(block1, SWT.PUSH);
        addToComboB1.setLayoutData(doubleColumnElem);
        addToComboB1.setText("ADD");
        Combo comboB1 = new Combo(block1, SWT.NONE);
        comboB1.setLayoutData(doubleColumnElem);

        Group block2 = new Group(mainShell, SWT.NONE);
        block2.setText("Block 2");
        block2.setLayoutData(gridBlock);
        block2.setLayout(new GridLayout(2, true));

        Group block3 = new Group(mainShell, SWT.NONE);
        block3.setText("Block 3");
        block3.setLayoutData(gridBlock);
        block3.setLayout(new GridLayout(2, true));

        Group block4 = new Group(mainShell, SWT.NONE);
        block4.setText("Block 4");
        block4.setLayoutData(gridBlock);
        block4.setLayout(new GridLayout(2, true));

        Group block5 = new Group(mainShell, SWT.NONE);
        block5.setText("Block 5");
        block5.setLayoutData(gridBlock);
        block5.setLayout(new GridLayout(2, true));

        /* creating our main window */
        mainShell.open();
        while(!mainShell.isDisposed())
        {
            if (!mainDisplay.readAndDispatch())
                mainDisplay.sleep();
        }
        mainDisplay.dispose();
    }
}
