package com.sagar.petstore.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;


public final class PetContract {

    private PetContract() {
    }

    /**
     * Inner class that defines constant values for the pets table.
     */
    public static final class PetEntry implements BaseColumns {

        public final static String TABLE_NAME = "pets";

        public final static String _ID = BaseColumns._ID;

        public final static String COLUMN_PET_NAME = "name";

        public final static String COLUMN_PET_BREED = "breed";

        public final static String COLUMN_PET_GENDER = "gender";

        public final static String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

        public static boolean isValidGender(int gender) {
            return gender == GENDER_UNKNOWN || gender == GENDER_MALE || gender == GENDER_FEMALE;
        }

        // end
    }


    // END
}

