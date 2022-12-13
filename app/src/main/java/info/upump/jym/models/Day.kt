package info.upump.jym.models

enum class Day {
    MONDAY() {
        override fun getColor() {
            TODO("Not yet implemented")
        }

        override fun getName() {
            TODO("Not yet implemented")
        }

    },
    TUESDAY() {
        override fun getColor() {
            TODO("Not yet implemented")
        }

        override fun getName() {
            TODO("Not yet implemented")
        }

    },
    WEDNESDAY() {
        override fun getColor() {
            TODO("Not yet implemented")
        }

        override fun getName() {
            TODO("Not yet implemented")
        }

    },
    THURSDAY() {
        override fun getColor() {
            TODO("Not yet implemented")
        }

        override fun getName() {
            TODO("Not yet implemented")
        }

    },
    FRIDAY() {
        override fun getColor() {
            TODO("Not yet implemented")
        }

        override fun getName() {
            TODO("Not yet implemented")
        }

    },
    SATURDAY() {
        override fun getColor() {
            TODO("Not yet implemented")
        }

        override fun getName() {
            TODO("Not yet implemented")
        }

    },
    SUNDAY() {
        override fun getColor() {
            TODO("Not yet implemented")
        }

        override fun getName() {
            TODO("Not yet implemented")
        }

    };

    abstract fun getColor()
    abstract fun getName()
}