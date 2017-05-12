package com.example.android.reportcard;

/**
 * Created by Adel on 5/12/2017.
 */

public class ReportCard {

    private static final String university = "Faculty of Mining, Geology and Petroleum Engineering";

    private int mSemester;
    private String mStudentName;
    private int mDrillingEngineering1;
    private int mWellboreFluids1;
    private int mPetroleumEngineeringEconomics;
    private int mOilAndGasProduction1;

    int getmSemester() {
        return mSemester;
    }

    String getmStudentName(){
        return mStudentName;
    }

    int getmDrillingEngineering1(){
        return mDrillingEngineering1;
    }

    int getmWellboreFluids1(){
        return mWellboreFluids1;
    }

    int getmPetroleumEngineeringEconomics(){
        return mPetroleumEngineeringEconomics;
    }

    int getmOilAndGasProduction1(){
        return mOilAndGasProduction1;
    }

    void setmDrillingEngineering1(int newValue){
        mDrillingEngineering1 = newValue;
    }

    void setmWellboreFluids1(int newValue){
        mWellboreFluids1 = newValue;
    }

    void setmPetroleumEngineeringEconomics(int newValue){
        mPetroleumEngineeringEconomics = newValue;
    }

    void setmOilAndGasProduction1(int newValue){
        mOilAndGasProduction1 = newValue;
    }

    public ReportCard(int semester, String name, int drillingEngineering1, int oilAndGasProduction1, int petroleumEngineeringEconomics, int wellboreFluids1){
        mSemester = semester;
        mStudentName = name;
        mDrillingEngineering1 = drillingEngineering1;
        mOilAndGasProduction1 = oilAndGasProduction1;
        mPetroleumEngineeringEconomics = petroleumEngineeringEconomics;
        mWellboreFluids1 = wellboreFluids1;
    }

    private String Grade(){
        double result = (mDrillingEngineering1 + mWellboreFluids1 + mPetroleumEngineeringEconomics + mOilAndGasProduction1) / 4;
        if (result < 25){
            return "insufficient";
        }else if (result >= 25 && result < 50){
            return "sufficient";
        }else if (result >= 50 && result < 75){
            return "good";
        }else if (result >= 75 && result < 90){
            return "very good";
        }else {
            return "excellent";
        }
    }

    public String toString(){
        return "ReportCard for: " + mStudentName + "\n" + university + "\nSemester: " + mSemester + "\nDrilling Engineering 1: " + mDrillingEngineering1
                + "\nWellbore Fluids 1: " + mWellboreFluids1 + "\nPetroleum Engineering Economics: " + mPetroleumEngineeringEconomics + "\nOil and Gas Production1: " + mOilAndGasProduction1
                + "\nGrade: " + Grade();
    }
}
