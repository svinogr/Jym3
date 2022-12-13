package info.upump.jym.models

import info.upump.jym.R

enum class TypeMuscle {
    NECK(){
        override fun getImg(): Int {
           return R.drawable.ic_menu_camera
        }

        override fun getName(): Int {
          return  R.string.neck
        }
    },  SHOULDER(){
        override fun getImg(): Int {
           return R.drawable.ic_menu_camera
        }

        override fun getName(): Int {
          return R.string.shoulder
        }
    },  TRAPS(){
        override fun getImg(): Int {
           return R.drawable.ic_menu_camera
        }

        override fun getName(): Int {
          return  R.string.traps
        }
    },  PECTORAL(){
        override fun getImg(): Int {
           return R.drawable.ic_menu_camera
        }

        override fun getName(): Int {
          return  R.string.pectoral
        }
    },  TRICEPS(){
        override fun getImg(): Int {
           return R.drawable.ic_menu_camera
        }

        override fun getName(): Int {
          return  R.string.triceps
        }
    },  BICEPS(){
        override fun getImg(): Int {
           return R.drawable.ic_menu_camera
        }

        override fun getName(): Int {
          return   R.string.biceps
        }
    },  BACK(){
        override fun getImg(): Int {
           return R.drawable.ic_menu_camera
        }

        override fun getName(): Int {
          return  R.string.back
        }
    },  GLUTES(){
        override fun getImg(): Int {
           return R.drawable.ic_menu_camera
        }

        override fun getName(): Int {
          return  R.string.glutes
        }
    },  QUADS(){
        override fun getImg(): Int {
           return R.drawable.ic_menu_camera
        }

        override fun getName(): Int {
          return  R.string.quades
        }
    },  HAMSTRINGS(){
        override fun getImg(): Int {
           return R.drawable.ic_menu_camera
        }

        override fun getName(): Int {
          return  R.string.hamstring
        }
    },  CALVES(){
        override fun getImg(): Int {
           return R.drawable.ic_menu_camera
        }

        override fun getName(): Int {
          return R.string.calves;
        }
    },  ABS(){
        override fun getImg(): Int {
           return R.drawable.ic_menu_camera
        }

        override fun getName(): Int {
          return   R.string.abs
        }
    };

    abstract fun getImg(): Int
    abstract fun getName(): Int
}