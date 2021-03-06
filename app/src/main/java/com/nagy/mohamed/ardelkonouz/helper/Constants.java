package com.nagy.mohamed.ardelkonouz.helper;

/**
 * Created by mohamednagy on 6/10/2017.
 */
public class Constants {
    public static final String TAG = "ArdElKonouz";
    public static final String ACTIVE_CODE = "16579";

    // Education
    public static final int NONE_EDUCATION_TYPE = 0;
    public static final int PRIMARY_EDUCATION_TYPE = 1;
    public static final int PREPARATORY_EDUCATION_TYPE = 2;
    public static final int SECONDARY_EDUCATION_TYPE = 3;
    public static final int SPECIAL_ENGLISH = 3;
    public static final int SPECIAL_ARABIC = 2;
    public static final int GOVERNMENTAL_ARABIC = 0;
    public static final int GOVERNMENTAL_ENGLISH = 1;

    //Paid
    public static final int PAID_SECTION = 1;
    public static final int NOT_PAID_SECTION = 2;

    // GENDER
    public static final int MALE = 0;
    public static final int FEMALE = 1;

    // EXTRAS
    public static final String CHILD_ID_EXTRA = "child extra";
    public static final String EMPLOYEE_ID_EXTRA = "employee extra";
    public static final String COURSE_ID_EXTRA = "course extra";
    public static final String INSTRUCTOR_ID_EXTRA = "instructor extra";
    public static final String INPUT_ADD_EXTRA = "add extra";
    public static final String INPUT_EDIT_EXTRA = "edit extra";
    public static final String INPUT_TYPE_EXTRA = "input extra";
    public static final String SECTION_ID_EXTRA = "section extra";

    // Loaders Id
    public static final int LOADER_CHILD_LIST = 11;
    public static final int LOADER_EMPLOYEE_LIST = 10;
    public static final int LOADER_INSTRUCTOR_LIST = 111;
    public static final int LOADER_COURSE_LIST = 110;
    public static final int LOADER_COURSE_CHILD_JOIN_LIST =1110;
    public static final int LOADER_INSTRUCTOR_COURSE_JOIN_LIST = 1111;
    public static final int LOADER_CHILD_COURSE_CONNECTOR =1212;
    public static final int LOADER_INSTRUCTOR_COURSE_CONNECTOR = 2121;
    public static final int LOADER_SALARY_LIST = 33;
    public static final int LOADER_INSTRUCTOR_SALARY = 44;
    public static final int LOADER_SHIFT_LIST = 55;
    public static final int LOADER_CHOICES_LIST = 66;
    public static final int LOADER_SELECTED_LIST = 77;
    public static final int LOADER_SHIFT_SECTION_PROFILE = 88;
    public static final int LOADER_COURSE_SECTION_LOADER = 99;

    //Birth Order
    public static final int FIRST_BIRTH = 0;
    public static final int MIDDLE_BIRTH = 1;
    public static final int LAST_BIRTH = 2;
    public static final int ALONE_ORDER = 3;

    // Year
    public static final int YEAR_STAGE_FIRST = 0;
    public static final int YEAR_STAGE_SECOND = 1;
    public static final int YEAR_STAGE_THIRD = 2;
    public static final int YEAR_STAGE_FOURTH = 3;
    public static final int YEAR_STAGE_FIFTH = 4;
    public static final int YEAR_STAGE_SIXTH = 5;
    public static final int YEAR_STAGE_NONE = 6;

    // Characteristic
    public static final int GOOD_SPEAKER = 0;
    public static final int SOCIAL = 1;
    public static final int LEADING = 2;
    public static final int NEURAL = 3;
    public static final int COLLABORATOR = 4;

    // Handling Problem
    public static final int ASK_FOR_HELP = 0;
    public static final int WORRIES_ANGRY = 1;
    public static final int LEAVE_PROBLE = 2;
    public static final int TRIES_TO_SOLVE = 3;

    // FreeTime
    public static final int DRAWING = 0;
    public static final int ELECTRONIC_GAMES = 1;
    public static final int WATCHING_TV = 2;
    public static final int HANDWORK = 3;

    // Date Type
    public static final String TODAY = "Today";
    public static final String TOMORROW = "Tomorrow";

    // Course State
    public static final int COURSE_COMPLETE = 0;
    public static final int COURSE_INCOMPLETE = 1;

    // child course state.
    public static final int CHILD_COMPLETE_COURSE = 1;
    public static final int CHILD_NOT_COMPLETE_COURSE = 2;

    // double choices
    public static final char SELECTED = '1';
    public static final char NOT_SELECTED = '2';
    public static final String DAYS_NOT_SELECTED = "2222222";
    public static final Long NULL = -1L;

    public static final short NO_INSTRUCTOR = -1;

    // Days
    public static final char SAT_DAY = 0;
    public static final char SUN_DAY = 1;
    public static final char MON_DAY = 2;
    public static final char TUE_DAY = 3;
    public static final char WED_DAY = 4;
    public static final char THU_DAY = 5;
    public static final char FRI_DAY = 6;

    public static final Long DAY_IN_MILS = Long.valueOf(24* 60 * 60 * 1000);

    public static class SaveState{

        public static final String GENDER_STATE = "GENDER SAVE";
        public static final String SECTION_STATE = "STATE SAVE";
        public static final String SECTION_DAYS = "COURSE DAYS";
        public static final String BIRTH_ORDER = "COURSE BIRTH";
        public static final String EDUCATION_TYPE = "EDUCATION TYPE";
        public static final String EDUCATION_STAGE = "EDUCATION STAGE";
        public static final String YEAR = "YEAR";
        public static final String CHARACTERISTIC = "CHARACTERISTIC";
        public static final String DEAL_PROBLEM = "DEAL PROBLEM";
        public static final String FREE_TIME = "FREE TIME";
        public static final String SHIFT_COURSE_SELECTION_ID = "SELECTION COURSES ID";
        public static final String CONNECTOR_CHILD_COURSE_SELECTION = "CONNECTOR CHILD SELECTION";
        public static final String CONNECTOR_INSTRUCTOR_COURSE_SELECTION = "CONNECTOR INSTRUCTOR SELECTION";

    }

    public static class DateType{
        public static final int START_DATE = 0;
        public static final int END_DATE = 1;
        public static final int START_TIME = 2;
        public static final int END_TIME  = 3;
    }

}
