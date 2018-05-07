package com.lab2bit32;

//swt imports
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.SWT;

public class Program {
    public static void main(String args[]) {
        //hub window
        Display mainDisplay = new Display();
        Shell mainShell = new Shell(mainDisplay);
        //create window
        Display createDisplay = new Display();
        Shell createShell = new Shell(createDisplay);
        //search window
        Display searchDisplay = new Display();
        Shell searchShell = new Shell(searchDisplay);
        //delete window
        Display deleteDisplay = new Display();
        Shell deleteShell = new Shell(deleteDisplay);

        GridLayout mainGL = new GridLayout(2, true);
        mainGL.marginBottom = 20;
        mainGL.marginTop = 15;
        mainGL.verticalSpacing = 10;
        mainGL.marginWidth = 10;

        GridLayout createGL = new GridLayout(3, true);
        createGL.marginBottom = 20;
        createGL.marginTop = 15;
        createGL.verticalSpacing = 10;
        createGL.marginWidth = 10;

        GridLayout searchGL = new GridLayout(3, true);
        searchGL.marginBottom = 20;
        searchGL.marginTop = 15;
        searchGL.verticalSpacing = 10;
        searchGL.marginWidth = 10;

        GridLayout deleteGL = new GridLayout(3, true);
        deleteGL.marginBottom = 20;
        deleteGL.marginTop = 15;
        deleteGL.verticalSpacing = 10;
        deleteGL.marginWidth = 10;

        mainShell.setLayout(mainGL);
        createShell.setLayout(createGL);
        searchShell.setLayout(searchGL);
        deleteShell.setLayout(deleteGL);

        GridData mainGD = new GridData(SWT.FILL, SWT.FILL, true, false);
        mainGD.horizontalSpan = 2;

        /* main shell */
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

        /* create shell */
        //'ere goes content
        Label createFIO = new Label(createShell, SWT.NONE);
        createFIO.setText("ФИО");
        createFIO.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        Text inputCreateFIO = new Text(createShell, SWT.NONE);
        inputCreateFIO.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        Label createAddress = new Label(createShell, SWT.NONE);
        createAddress.setText("Адрес");
        createAddress.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        Text inputCreateAddress = new Text(createShell, SWT.NONE);
        inputCreateAddress.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        Label createMobile = new Label(createShell, SWT.NONE);
        createMobile.setText("Моб. телефон");
        createMobile.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        Text inputCreateMobile = new Text(createShell, SWT.NONE);
        inputCreateMobile.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        Label createHome = new Label(createShell, SWT.NONE);
        createHome.setText("Дом. телефон");
        createHome.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        Text inputCreateHome = new Text(createShell, SWT.NONE);
        inputCreateHome.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        Button createAddStop = new Button(createShell, SWT.PUSH);
        createAddStop.setText("Добавить и остановить");
        createAddStop.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        Button createAddContinue = new Button(createShell, SWT.PUSH);
        createAddContinue.setText("Добавить и продолжить");
        createAddContinue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        /* TODO: addSelectionListeners for both buttons */

        /* search shell */
        //'ere goes content
        /* TODO: add search for 2 phones */
        Label searchSurname = new Label(searchShell, SWT.NONE);
        searchSurname.setText("Фамилия");
        searchSurname.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        Text inputSearchSurname = new Text(searchShell, SWT.NONE);
        inputSearchSurname.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        Label searchPhone = new Label(searchShell, SWT.NONE);
        searchPhone.setText("Номер телефона");
        searchPhone.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        Text inputSearchPhone = new Text(searchShell, SWT.NONE);
        inputSearchPhone.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        Label searchAddress = new Label(searchShell, SWT.NONE);
        searchAddress.setText("Адрес");
        searchAddress.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        Text inputSearchAddress = new Text(searchShell, SWT.NONE);
        inputSearchAddress.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        Label searchPhoneDigits = new Label(searchShell, SWT.NONE);
        searchPhoneDigits.setText("Адрес");
        searchPhoneDigits.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        Text inputSearchPhoneDigits = new Text(searchShell, SWT.NONE);
        inputSearchPhoneDigits.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        Button searchSurnameNumber = new Button(searchShell, SWT.PUSH);
        searchSurnameNumber.setText("Найти по фамилии и номеру телефона");
        searchSurnameNumber.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
        Button searchAddressNumber = new Button(searchShell, SWT.PUSH);
        searchAddressNumber.setText("Найти по адресу и номеру телефона");
        searchAddressNumber.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
        Button searchSurnameNumberDigits = new Button(searchShell, SWT.PUSH);
        searchSurnameNumberDigits.setText("Найти по фамилии и цифрам телефона");
        searchSurnameNumberDigits.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
        //'ere goes table

        /* delete shell */
        //'ere goes content
        /* TODO: add delete for 2 phones */
        Label deleteSurname = new Label(deleteShell, SWT.NONE);
        deleteSurname.setText("Фамилия");
        deleteSurname.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        Text inputDeleteSurname = new Text(deleteShell, SWT.NONE);
        inputDeleteSurname.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        Label deletePhone = new Label(deleteShell, SWT.NONE);
        deletePhone.setText("Номер телефона");
        deletePhone.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        Text inputDeletePhone = new Text(deleteShell, SWT.NONE);
        inputDeletePhone.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        Label deleteAddress = new Label(deleteShell, SWT.NONE);
        deleteAddress.setText("Адрес");
        deleteAddress.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        Text inputDeleteAddress = new Text(deleteShell, SWT.NONE);
        inputDeleteAddress.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        Label deletePhoneDigits = new Label(deleteShell, SWT.NONE);
        deletePhoneDigits.setText("Адрес");
        deletePhoneDigits.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        Text inputDeletePhoneDigits = new Text(deleteShell, SWT.NONE);
        inputDeletePhoneDigits.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        Button deleteSurnameNumber = new Button(deleteShell, SWT.PUSH);
        deleteSurnameNumber.setText("Найти по фамилии и номеру телефона");
        deleteSurnameNumber.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
        Button deleteAddressNumber = new Button(deleteShell, SWT.PUSH);
        deleteAddressNumber.setText("Найти по адресу и номеру телефона");
        deleteAddressNumber.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
        Button deleteSurnameNumberDigits = new Button(deleteShell, SWT.PUSH);
        deleteSurnameNumberDigits.setText("Найти по фамилии и цифрам телефона");
        deleteSurnameNumberDigits.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
        //'ere goes table

        //'ere goes button controls
         create.addSelectionListener(new SelectionAdapter() {
             @Override
             public void widgetSelected(SelectionEvent e) {
                 /* TODO: call createShell */

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

/* TODO: fix searchShell and deleteShell; */
/* TODO: add table to the main hub */
/* TODO: add table basically everywhere (search, delete) */
/* TODO: work with standard save/load
 * use FileDialog(shell, SWT.OPEN/SWT.SAVE) for this */
/* TODO: add parcers for reading/writing */
/* TODO: make all the buttons work */