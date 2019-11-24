package com.example.medicineremainder.alarm;

import com.example.medicineremainder.BasePresenter;
import com.example.medicineremainder.BaseView;
import com.example.medicineremainder.data.source.History;
import com.example.medicineremainder.data.source.MedicineAlarm;

public interface ReminderContract {
    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}

