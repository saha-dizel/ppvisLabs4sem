package com.FinalWarning;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;

import java.util.LinkedList;

public class Program {
    public static void main(String[] args)
    {
        /* this is display and shell for main window */
        Display mainDisplay = new Display();
        Shell mainShell = new Shell(mainDisplay);

        /* this is layout with specs for main window */
        GridLayout mainGridLayout = new GridLayout(10, true);
        mainGridLayout.horizontalSpacing = 10;
        mainGridLayout.marginBottom = 20;
        mainGridLayout.marginTop = 15;
        mainGridLayout.marginWidth = 10;
        mainGridLayout.verticalSpacing = 10;

        /* setting layout for main shell */
        mainShell.setLayout(mainGridLayout);

        /* grid data for the blocks */
        GridData gridBlock = new GridData(SWT.FILL, SWT.FILL, true, true);
        gridBlock.horizontalSpan = 2;

        /* grid data for double column elements */
        GridData doubleColumnElem = new GridData (SWT.FILL, SWT.FILL, true, false);
        doubleColumnElem.horizontalSpan = 2;
        doubleColumnElem.heightHint = 28;

        /* grid data for 5-column elements */
        GridData fiveColumnElem = new GridData (SWT.FILL, SWT.FILL, true, false);
        fiveColumnElem.horizontalSpan = 5;

        /* grid data for single column elements */
        GridData singleColumnElem = new GridData (SWT.FILL, SWT.FILL, true, false);
        singleColumnElem.horizontalSpan = 1;
        singleColumnElem.heightHint = 28;

        /* grid data for table */
        GridData tableElem = new GridData(SWT.FILL, SWT.FILL, true, false);
        tableElem.horizontalSpan = 2;

        /* message box */
        MessageBox error = new MessageBox(mainShell, SWT.ICON_ERROR | SWT.OK);
        error.setText("ERROR!");
        error.setMessage("Whoops! Looks like you've made something wrong!");

        Button startMovingElem = new Button(mainShell, SWT.PUSH);
        startMovingElem.setText("START");
        startMovingElem.setLayoutData(fiveColumnElem);
        Button stopMovingElem = new Button(mainShell, SWT.PUSH);
        stopMovingElem.setText("STOP");
        stopMovingElem.setLayoutData(fiveColumnElem);

        Group block1 = new Group(mainShell, SWT.NONE);
        block1.setText("Block 1");
        block1.setLayoutData(gridBlock);
        block1.setLayout(new GridLayout(2, true));
        /* creating elements for block1 */
        Text inputLineB1 = new Text(block1, SWT.NONE);
        inputLineB1.setLayoutData(doubleColumnElem);
        Button addToComboB1 = new Button(block1, SWT.PUSH);
        addToComboB1.setLayoutData(doubleColumnElem);
        addToComboB1.setText("Add to the combo");
        Combo comboB1 = new Combo(block1, SWT.DROP_DOWN);
        comboB1.setLayoutData(doubleColumnElem);
        /* writing logic for block1 */
        addToComboB1.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e){
                String textToCombo = inputLineB1.getText();
                if (comboB1.indexOf(textToCombo) == -1) {
                    comboB1.add(textToCombo);
                } else {
                    error.open();
                }
            }
        });

        Group block2 = new Group(mainShell, SWT.NONE);
        block2.setText("Block 2");
        block2.setLayoutData(gridBlock);
        block2.setLayout(new GridLayout(2, true));
        /* creating elements for block2 */
        Text inputLineB2 = new Text(block2, SWT.NONE);
        inputLineB2.setLayoutData(doubleColumnElem);
        Button nameSecondButtonB2 = new Button(block2, SWT.PUSH);
        nameSecondButtonB2.setLayoutData(singleColumnElem);
        nameSecondButtonB2.setText("Name the right button");
        Button swapButtonNamesB2 = new Button(block2, SWT.PUSH);
        swapButtonNamesB2.setLayoutData(singleColumnElem);
        swapButtonNamesB2.setText("Swap button names");
        /* writing logic for block2 */
        nameSecondButtonB2.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e){
                String newName4Button2 = inputLineB2.getText();
                swapButtonNamesB2.setText(newName4Button2);
            }
        });
        swapButtonNamesB2.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e){
                String tempNameButton1 = nameSecondButtonB2.getText();
                nameSecondButtonB2.setText(swapButtonNamesB2.getText());
                swapButtonNamesB2.setText(tempNameButton1);
            }
        });

        Group block3 = new Group(mainShell, SWT.NONE);
        block3.setText("Block 3");
        block3.setLayoutData(gridBlock);
        block3.setLayout(new GridLayout(2, true));
        /* creating elements for block3 */
        Text inputLineB3 = new Text(block3, SWT.NONE);
        inputLineB3.setLayoutData(doubleColumnElem);
        Button toggleRadioB3 = new Button(block3, SWT.PUSH);
        toggleRadioB3.setLayoutData(doubleColumnElem);
        toggleRadioB3.setText("Toggle selected radio button");
        Button radio1B3 = new Button(block3, SWT.RADIO);
        radio1B3.setLayoutData(doubleColumnElem);
        radio1B3.setText("RB1");
        Button radio2B3 = new Button(block3, SWT.RADIO);
        radio2B3.setLayoutData(doubleColumnElem);
        radio2B3.setText("RB2");
        Button radio3B3 = new Button(block3, SWT.RADIO);
        radio3B3.setLayoutData(doubleColumnElem);
        radio3B3.setText("RB3");
        /* writing logic for block3 */
        toggleRadioB3.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e){
                String nameCheck = inputLineB3.getText();
                switch (nameCheck.toUpperCase()){
                    case "RB1":
                        radio1B3.setSelection(true);
                        radio2B3.setSelection(false);
                        radio3B3.setSelection(false);
                        break;
                    case "RB2":
                        radio1B3.setSelection(false);
                        radio2B3.setSelection(true);
                        radio3B3.setSelection(false);
                        break;
                    case "RB3":
                        radio1B3.setSelection(false);
                        radio2B3.setSelection(false);
                        radio3B3.setSelection(true);
                        break;
                    default:
                        error.open();
                        break;
                }
            }
        });

        Group block4 = new Group(mainShell, SWT.NONE);
        block4.setText("Block 4");
        block4.setLayoutData(gridBlock);
        block4.setLayout(new GridLayout(2, true));
        /* creating elements for block4 */
        Text inputLineB4 = new Text(block4, SWT.NONE);
        inputLineB4.setLayoutData(doubleColumnElem);
        Button toggleCheckB4 = new Button(block4, SWT.PUSH);
        toggleCheckB4.setLayoutData(doubleColumnElem);
        toggleCheckB4.setText("Toggle selected check button");
        Button check1B4 = new Button(block4, SWT.CHECK);
        check1B4.setLayoutData(doubleColumnElem);
        check1B4.setText("CB1");
        Button check2B4 = new Button(block4, SWT.CHECK);
        check2B4.setLayoutData(doubleColumnElem);
        check2B4.setText("CB2");
        Button check3B4 = new Button(block4, SWT.CHECK);
        check3B4.setLayoutData(doubleColumnElem);
        check3B4.setText("CB3");
        /* writing logic for block4 */
        toggleCheckB4.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e){
                String nameCheck = inputLineB4.getText();
                switch (nameCheck.toUpperCase()){
                    case "CB1":
                        if (!check1B4.getSelection()) {
                            check1B4.setSelection(true);
                        } else {
                            check1B4.setSelection(false);
                        }
                        break;
                    case "CB2":
                        if (!check2B4.getSelection()) {
                            check2B4.setSelection(true);
                        } else {
                            check2B4.setSelection(false);
                        }
                        break;
                    case "CB3":
                        if (!check3B4.getSelection()) {
                            check3B4.setSelection(true);
                        } else {
                            check3B4.setSelection(false);
                        }
                        break;
                    default:
                        error.open();
                        break;
                }
            }
        });

        Group block5 = new Group(mainShell, SWT.NONE);
        block5.setText("Block 5");
        block5.setLayoutData(gridBlock);
        block5.setLayout(new GridLayout(2, true));
        /* creating elements for block5 */
        Text inputLineB5 = new Text(block5, SWT.NONE);
        inputLineB5.setLayoutData(doubleColumnElem);
        Button addToTableB5 = new Button(block5, SWT.PUSH);
        addToTableB5.setLayoutData(doubleColumnElem);
        addToTableB5.setText("Add to the first column");
        Table tableB5 = new Table(block5, SWT.VIRTUAL | SWT.BORDER | SWT.FULL_SELECTION);
        tableB5.setLayoutData(tableElem);
        tableB5.setLinesVisible(true);
        String[] titles = {"Title1", "Title2"};
        for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
            TableColumn column = new TableColumn(tableB5, SWT.NONE);
            column.setText(titles[loopIndex]);
        }
        for(int loopIndex = 0; loopIndex < 3; loopIndex++) {
            TableItem item = new TableItem(tableB5, SWT.NONE);
            item.setText(0, "Item" + loopIndex);
        }
        for(int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
            tableB5.getColumn(loopIndex).setWidth(125);
        }
        Button moveLeftB5 = new Button(block5, SWT.PUSH);
        moveLeftB5.setLayoutData(singleColumnElem);
        moveLeftB5.setText("<<");
        Button moveRightB5 = new Button(block5, SWT.PUSH);
        moveRightB5.setLayoutData(singleColumnElem);
        moveRightB5.setText(">>");
        /* writing logic for block5 */
        addToTableB5.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e){
                String newTableItem = inputLineB5.getText();
                TableItem item = new TableItem(tableB5, SWT.NONE);
                item.setText(0, newTableItem);
            }
        });
        moveRightB5.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e){
                int itemIndex = tableB5.getSelectionIndex();
                TableItem item = tableB5.getItem(itemIndex);
                if (!item.getText(0).equals(""))
                {
                    item.setText(1, item.getText(0));
                    item.setText(0, "");
                }
            }
        });
        moveLeftB5.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e){
                int itemIndex = tableB5.getSelectionIndex();
                TableItem item = tableB5.getItem(itemIndex);
                if (!item.getText(1).equals(""))
                {
                    item.setText(0, item.getText(1));
                    item.setText(1, "");
                }
            }
        });

        /* five linked lists for our queues */
        LinkedList<Control> listB1 = new LinkedList<Control>();
        listB1.add(comboB1);
        listB1.add(addToComboB1);
        listB1.add(inputLineB1);
        LinkedList<Control> listB2 = new LinkedList<Control>();
        listB2.add(nameSecondButtonB2);
        listB2.add(swapButtonNamesB2);
        listB2.add(inputLineB2);
        LinkedList<Control> listB3 = new LinkedList<Control>();
        listB3.add(radio3B3);
        listB3.add(radio2B3);
        listB3.add(radio1B3);
        listB3.add(toggleRadioB3);
        listB3.add(inputLineB3);
        LinkedList<Control> listB4 = new LinkedList<Control>();
        listB4.add(check3B4);
        listB4.add(check2B4);
        listB4.add(check1B4);
        listB4.add(toggleCheckB4);
        listB4.add(inputLineB4);
        LinkedList<Control> listB5 = new LinkedList<Control>();
        listB5.add(moveRightB5);
        listB5.add(moveLeftB5);
        listB5.add(tableB5);
        listB5.add(addToTableB5);
        listB5.add(inputLineB5);
        /* adding elements to end, moving from beginning, classic */

        final boolean[] setMoveState = {false};

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (setMoveState[0]) {
                    int queueNum = 0;
                    while (queueNum < 5 && setMoveState[0]) {
                        switch (queueNum) {
                            case 0:
                                Display.getDefault().syncExec(new Runnable() {
                                    @Override
                                    public void run() {
                                        listB1.peekFirst().setParent(block2);
                                        listB2.addLast(listB1.pollFirst());

                                        for (int redrawOrder = 0; redrawOrder < listB1.size() - 1; redrawOrder++) {
                                            listB1.get(redrawOrder).moveAbove(listB1.get(redrawOrder + 1));
                                        }

                                        for (int redrawOrder = 0; redrawOrder < listB2.size() - 1; redrawOrder++) {
                                            listB2.get(redrawOrder).moveAbove(listB2.get(redrawOrder + 1));
                                        }

                                        block1.layout();
                                        block2.layout();
                                        mainShell.layout();
                                    }
                                });
                                break;
                            case 1:
                                Display.getDefault().syncExec(new Runnable() {
                                    @Override
                                    public void run() {
                                        listB2.peekFirst().setParent(block3);
                                        listB3.addLast(listB2.pollFirst());

                                        for (int redrawOrder = 0; redrawOrder < listB2.size() - 1; redrawOrder++) {
                                            listB2.get(redrawOrder).moveAbove(listB2.get(redrawOrder + 1));
                                        }

                                        for (int redrawOrder = 0; redrawOrder < listB3.size() - 1; redrawOrder++) {
                                            listB3.get(redrawOrder).moveAbove(listB3.get(redrawOrder + 1));
                                        }

                                        block2.layout();
                                        block3.layout();
                                        mainShell.layout();
                                    }
                                });
                                break;
                            case 2:
                                Display.getDefault().syncExec(new Runnable() {
                                    @Override
                                    public void run() {
                                        listB3.peekFirst().setParent(block4);
                                        listB4.addLast(listB3.pollFirst());

                                        for (int redrawOrder = 0; redrawOrder < listB3.size() - 1; redrawOrder++) {
                                            listB3.get(redrawOrder).moveAbove(listB3.get(redrawOrder + 1));
                                        }

                                        for (int redrawOrder = 0; redrawOrder < listB4.size() - 1; redrawOrder++) {
                                            listB4.get(redrawOrder).moveAbove(listB4.get(redrawOrder + 1));
                                        }

                                        block3.layout();
                                        block4.layout();
                                        mainShell.layout();
                                    }
                                });
                                break;
                            case 3:
                                Display.getDefault().syncExec(new Runnable() {
                                    @Override
                                    public void run() {
                                        listB4.peekFirst().setParent(block5);
                                        listB5.addLast(listB4.pollFirst());

                                        for (int redrawOrder = 0; redrawOrder < listB4.size() - 1; redrawOrder++) {
                                            listB4.get(redrawOrder).moveAbove(listB4.get(redrawOrder + 1));
                                        }

                                        for (int redrawOrder = 0; redrawOrder < listB5.size() - 1; redrawOrder++) {
                                            listB5.get(redrawOrder).moveAbove(listB5.get(redrawOrder + 1));
                                        }

                                        block4.layout();
                                        block5.layout();
                                        mainShell.layout();
                                    }
                                });
                                break;
                            case 4:
                                Display.getDefault().syncExec(new Runnable() {
                                    @Override
                                    public void run() {
                                        listB5.peekFirst().setParent(block1);
                                        listB1.addLast(listB5.pollFirst());

                                        for (int redrawOrder = 0; redrawOrder < listB5.size() - 1; redrawOrder++) {
                                            listB5.get(redrawOrder).moveAbove(listB5.get(redrawOrder + 1));
                                        }

                                        for (int redrawOrder = 0; redrawOrder < listB1.size() - 1; redrawOrder++) {
                                            listB1.get(redrawOrder).moveAbove(listB1.get(redrawOrder + 1));
                                        }

                                        block5.layout();
                                        block1.layout();
                                        mainShell.layout();
                                    }
                                });
                                break;
                        }
                        queueNum++;
                    }
                }
            }
        };

        final Thread[] moveElemThread = new Thread[1];

        startMovingElem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                moveElemThread[0] = new Thread(runnable){};
                setMoveState[0] = true;
                moveElemThread[0].start();
            }
        });

        stopMovingElem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                setMoveState[0] = false;
                moveElemThread[0].interrupt();
            }
        });

        /* creating our main window */
        mainShell.open();
        while(!mainShell.isDisposed()) {
            if (!mainDisplay.readAndDispatch())
                mainDisplay.sleep();
        }
        mainDisplay.dispose();
    }
}
