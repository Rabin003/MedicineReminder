package com.example.medicineremainder.addMedicine;

import com.example.medicineremainder.BasePresenter;
import com.example.medicineremainder.BaseView;
import com.example.medicineremainder.data.source.MedicineAlarm;
import com.example.medicineremainder.data.source.Pills;

import java.util.List;

public interface AddMedicineContract {
    interface View extends BaseView<Presenter> {

        void showEmptyMedicineError();

        void showMedicineList();

        boolean isActive();

    }

    interface  Presenter extends BasePresenter {


        void saveMedicine(MedicineAlarm alarm, Pills pills);


        boolean isDataMissing();

        boolean isMedicineExits(String pillName);

        long addPills(Pills pills);

        Pills getPillsByName(String pillName);

        List<MedicineAlarm> getMedicineByPillName(String pillName);

        List<Long> tempIds();

        void deleteMedicineAlarm(long alarmId);

    }
}
