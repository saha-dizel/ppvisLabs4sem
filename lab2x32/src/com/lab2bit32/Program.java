package com.lab2bit32;

//swt imports
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.SWT;

public class Program {
    public static void main(String args[]) {
        Display mainDisplay = new Display();
        Shell mainShell = new Shell(mainDisplay);

        GridLayout mainGL = new GridLayout(2, true);
        mainGL.marginBottom = 20;
        mainGL.marginTop = 15;
        mainGL.verticalSpacing = 10;
        mainGL.marginWidth = 10;

        mainShell.setLayout(mainGL);

        GridData mainGD = new GridData(SWT.FILL, SWT.FILL, true, false);
        mainGD.horizontalSpan = 2;

        //'ere goes buttons
        Button create = new Button(mainShell, SWT.PUSH);
        create.setText("Create array");
        create.setLayoutData(mainGD);
        Button search = new Button(mainShell, SWT.PUSH);
        search.setText("Find element in array");
        search.setLayoutData(mainGD);
        Button delete = new Button(mainShell, SWT.PUSH);
        delete.setText("Delete element from array");
        delete.setLayoutData(mainGD);
        Button save = new Button(mainShell, SWT.PUSH);
        save.setText("Save array");
        save.setLayoutData(mainGD);
        Button load = new Button(mainShell, SWT.PUSH);
        load.setText("Load array");
        load.setLayoutData(mainGD);

        //'ere goes table


        //'ere goes table controls

        //most likely need to redo to update it dynamically
        Label rowNum = new Label(mainShell, SWT.NONE);
        rowNum.setText("Number of elements in array: "/* + take from table num of rows*/);
        rowNum.setLayoutData(mainGD);

        /* creating our main window */
        mainShell.open();
        while(!mainShell.isDisposed()) {
            if (!mainDisplay.readAndDispatch())
                mainDisplay.sleep();
        }
        mainDisplay.dispose();
    }
}
