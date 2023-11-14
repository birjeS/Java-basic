package Week5;

public class Ex92 {
    public static void main(String[] args) {
        MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println(second + " and " + first + " difference in years: " + second.differenceInYears(first));
        System.out.println(third + " and " + first + " difference in years: " + third.differenceInYears(first));
        System.out.println(second + " and " + third + " difference in years: " + second.differenceInYears(third));

        // Additional tests for Exercise 92.2 and 92.3
        System.out.println(first + " and " + second + " difference in years: " + second.differenceInYears(first));
        System.out.println(second + " and " + first + " difference in years: " + first.differenceInYears(second));
        System.out.println(first + " and " + third + " difference in years: " + third.differenceInYears(first));
        System.out.println(third + " and " + first + " difference in years: " + first.differenceInYears(third));
        System.out.println(third + " and " + second + " difference in years: " + second.differenceInYears(third));
        System.out.println(second + " and " + third + " difference in years: " + third.differenceInYears(second));
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    // Exercise 92.1
    public int differenceInYears(MyDate comparedDate) {
        return this.year - comparedDate.year;
    }

    // Exercise 92.2
    public int differenceInYearsV2(MyDate comparedDate) {
        int yearsDifference = this.year - comparedDate.year;

        if (this.month < comparedDate.month || (this.month == comparedDate.month && this.day < comparedDate.day)) {
            yearsDifference--;
        }

        return yearsDifference;
    }

    // Exercise 92.3
    public int differenceInYearsV3(MyDate comparedDate) {
        int yearsDifference = Math.abs(this.year - comparedDate.year);

        if (this.year < comparedDate.year || (this.year == comparedDate.year && this.month < comparedDate.month)
                || (this.year == comparedDate.year && this.month == comparedDate.month && this.day < comparedDate.day)) {
            yearsDifference--;
        }

        return yearsDifference;
    }
}
