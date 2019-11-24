package com.example.medicineremainder.medicine;

import com.example.medicineremainder.BasePresenter;
import com.example.medicineremainder.BaseView;
import com.example.medicineremainder.data.source.MedicineAlarm;

import java.util.List;

public interface MedicineContract {
    interface View extends BaseView<Presenter> {

        void showLoadingIndicator(boolean active);

        void showMedicineList(List<MedicineAlarm> medicineAlarmList);

        void showAddMedicine();

        void showMedicineDetails(long medId, String medName);

        void showLoadingMedicineError();

        void showNoMedicine();

        void showSuccessfullySavedMessage();

        boolean isActive();


    }

    interface Presenter extends BasePresenter {

        void onStart(int day);

        void reload(int day);

        void result(int requestCode, int resultCode);

        void loadMedicinesByDay(int day, boolean showIndicator);


        void addNewMedicine();

    }
}
