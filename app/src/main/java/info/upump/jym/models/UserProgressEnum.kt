package info.upump.jym.models

import info.upump.jym.R

enum class UserProgressEnum {
    WEIGHT() {
        override fun getImg(): Int {
            return R.drawable.ic_menu_camera;
        }

        override fun getName(): Int {
            return R.string.label_title_user_weight
        }
    },
    HEIGHT() {
        override fun getImg(): Int {
            return R.drawable.ic_menu_camera;
        }

        override fun getName(): Int {
            return R.string.label_title_user_height
        }
    },
    FAT() {
        override fun getImg(): Int {
            return R.drawable.ic_menu_camera;
        }

        override fun getName(): Int {
            return R.string.label_title_user_fat
        }
    },
    NECK() {
        override fun getImg(): Int {
            return R.drawable.ic_menu_camera;
        }

        override fun getName(): Int {
            return R.string.label_title_user_neck
        }
    },
    SHOULDER() {
        override fun getImg(): Int {
            return R.drawable.ic_menu_camera
        }

        override fun getName(): Int {
            return R.string.label_title_user_shoulders
        }
    },
    PECTORAL() {
        override fun getImg(): Int {
            return R.drawable.ic_menu_camera;
        }

        override fun getName(): Int {
            return R.string.label_title_user_pectoral
        }
    },
    BICEPS_LEFT() {
        override fun getImg(): Int {
            return R.drawable.ic_menu_camera;
        }

        override fun getName(): Int {
            return R.string.label_title_user_left_biceps
        }
    },
    BICEPS_RIGHT() {
        override fun getImg(): Int {
            return R.drawable.ic_menu_camera;
        }

        override fun getName(): Int {
            return R.string.label_title_user_right_biceps
        }
    },
    LEG_LEFT() {
        override fun getImg(): Int {
            return R.drawable.ic_menu_camera;
        }

        override fun getName(): Int {
            return R.string.label_title_user_left_leg
        }
    },
    LEG_RIGHT() {
        override fun getImg(): Int {
            return R.drawable.ic_menu_camera;
        }

        override fun getName(): Int {
            return R.string.label_title_user_right_leg
        }
    },
    CALVES_LEFT() {
        override fun getImg(): Int {
            return R.drawable.ic_menu_camera;
        }

        override fun getName(): Int {
            return R.string.label_title_user_left_calves
        }
    },
    CALVES_RIGHT() {
        override fun getImg(): Int {
            return R.drawable.ic_menu_camera;
        }

        override fun getName(): Int {
            return R.string.label_title_user_right_calves
        }
    },
    ABS() {
        override fun getImg(): Int {
            return R.drawable.ic_menu_camera;
        }

        override fun getName(): Int {
            return R.string.label_title_user_abs
        }
    };

    abstract fun getImg(): Int
    abstract fun getName(): Int
}