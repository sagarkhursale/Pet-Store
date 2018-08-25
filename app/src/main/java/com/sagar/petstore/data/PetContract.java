package com.sagar.petstore.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;


public final class PetContract {

    private PetContract() {
    }

    // Constants for content uri.
    public static final String CONTENT_AUTHORITY = "com.sagar.petstore";
    static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    static final String PATH_PETS = "pets";


    /**
     * Inner class that defines constant values for the pets table.
     */
    public static final class PetEntry implements BaseColumns {

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;


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

