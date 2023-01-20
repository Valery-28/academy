package HomeWork4.Task1;

public class CustomDate {
    private Year year;
    private Month month;
    private Day day;

    public CustomDate() {
        super();
    }

    public CustomDate(String date) {
        super();
        year = new Year(date);
        month = new Month(date);
        day = new Day(date);
    }

    public void setDate(String date) {
        year = new Year(date);
        month = new Month(date);
        day = new Day(date);
    }

    public int getYear() {
        return year.yearInt;
    }

    public int getMonth() {
        return month.monthInt;
    }

    public int getDay() {
        return day.dayInt;
    }
    public DaysOfWeek getDayOfWeek() {
        int h;
        if (month.monthInt < 3) {
            h = (day.dayInt + (int) (13 * (month.monthInt + 12 + 1) / 5) + (year.yearInt - 1)
                    + (int) ((year.yearInt - 1) / 4) - (int) ((year.yearInt - 1) / 100)
                    + (int) ((year.yearInt - 1) / 400)) % 7;
        } else {
            h = (day.dayInt + (int) (13 * (month.monthInt + 1) / 5) + (year.yearInt - 1)
                    + (int) ((year.yearInt - 1) / 4) - (int) ((year.yearInt - 1) / 100)
                    + (int) ((year.yearInt - 1) / 400)) % 7;
        }

        switch (h) {
            case 0:
                return DaysOfWeek.SATURDAY;
            case 1:
                return DaysOfWeek.SUNDAY;
            case 2:
                return DaysOfWeek.MONDAY;
            case 3:
                return DaysOfWeek.TUESDAY;
            case 4:
                return DaysOfWeek.WEDNESDAY;
            case 5:
                return DaysOfWeek.THURSDAY;
            case 6:
                return DaysOfWeek.FRIDAY;
            default:
                return null;
        }

    }
    public int getDifferenceInDays(CustomDate date) {
        if (year.yearInt == date.year.yearInt) {
            return Math.abs(getDayOfYear() - date.getDayOfYear());
        }
        return calcDays(date);
    }

    private int calcDays(CustomDate date) {
        int days = 0;
        days = (Math.abs(year.yearInt - date.year.yearInt) - 1) * 365;
        if (year.yearInt > date.year.yearInt) {
            for (int i = date.year.yearInt + 1; i < year.yearInt; i++) {
                if (isLeapYear(i)) {
                    days += 1;
                }
            }
            days += getDayOfYear();
            if (date.isLeapYear()) {
                days += 366 - date.getDayOfYear();
            } else {
                days += 365 - date.getDayOfYear();
            }
        } else {
            for (int i = year.yearInt + 1; i < date.year.yearInt; i++) {
                if (isLeapYear(i)) {
                    days += 1;
                }
            }
            days += date.getDayOfYear();
            if (isLeapYear()) {
                days += 366 - getDayOfYear();
            } else {
                days += 365 - getDayOfYear();
            }
        }
        return days;
    }
    public int getDayOfYear() {
        int[] quantDaysMonthUsually = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int[] quantDaysMonthLeap = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int numberDay = 0;
        if (isLeapYear()) {
            for (int i = 1; i < month.monthInt; i++) {
                numberDay += quantDaysMonthLeap[i - 1];
            }
        } else {
            for (int i = 1; i < month.monthInt; i++) {
                numberDay += quantDaysMonthUsually[i - 1];
            }
        }

        return numberDay + day.dayInt;
    }

    public boolean isLeapYear() {
        return isLeapYear(year.yearInt);
    }
    static boolean isLeapYear(int yearInt) {
        if (yearInt % 4 == 0) {
            if (yearInt % 100 == 0) {
                if (!(yearInt % 400 == 0)) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    private class Year {
        int yearInt;

        Year(String date) {
            super();
            yearInt = Integer.parseInt(date.split("-")[2]);
        }
    }

    private class Month {
        int monthInt;

        Month(String date) {
            super();
            monthInt = Integer.parseInt(date.split("-")[1]);
        }
    }

    private class Day {
        int dayInt;

        Day(String date) {
            super();
            dayInt = Integer.parseInt(date.split("-")[0]);
        }
    }
}

