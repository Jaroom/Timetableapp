public class LULTimetable {
	String subject;
	String lesson;
	String tutor;
	time TimeOfSession;
	public void setTime(String time)
	{
		this.TimeOfSession=new time(time);
	}
}


class time
{
    String str; // Stores time as string
    int hours; // Stores hours in int
    int minutes; // Stores minutes in int

    /* Constructor */
    time (String argTimeStr)
    {
        if (argTimeStr.length() == 5 && argTimeStr.charAt(2) == ':' // Check for format 00:00
            && Integer.parseInt(argTimeStr.substring(0, 2)) < 24 // Check logic error in hours (above 24h)
            && Integer.parseInt(argTimeStr.substring(3, 5)) < 60) // Check logic error in minutes (above 60minutes)
        {
            str = argTimeStr; // Set time to parameter
            hours = Integer.parseInt(argTimeStr.substring(0, 2)); // Set hours from str
            minutes = Integer.parseInt(argTimeStr.substring(3, 5)); // Set minutes from str
        }

        else 

            str = "\0"; // If invalid time, return NULL string
    }

    /* Add other time */
    void add(time AddTime)
    {
        minutes += AddTime.minutes; // Addition minutes from other time to your time

        /* Check for logic error (higher than 60 minutess) */
        if (minutes >= 60)
        {
            hours++; // Add 1 hours to time
            minutes -= 60; // Subtract 60 minutess from current minutes
        }

        hours += AddTime.hours; // Add hours from other time to your time

        /* Set str according to new chagnes */
        str = ((hours < 10) ? "0" + Integer.toString(hours) : Integer.toString(hours)) + ":" + ((minutes < 10) ? "0" + Integer.toString(minutes) : Integer.toString(minutes));
    }

    /* Subtract with other time */
    void sub(time SubTime)
    {
        minutes -= SubTime.minutes; // Addition minutes from other time to your time

        /* Check for logic error (lower than 0) */
        if (minutes < 0)
        {
            hours--; // Subtract 1 hour from your time
            minutes += 60; // Add 60 minutess to current minutes
        }

        hours -= SubTime.hours; // Subtract hours from your time with other time hours

        /* Set str according to new chagnes */
        str = ((hours < 10) ? "0" + Integer.toString(hours) : Integer.toString(hours)) + ":" + ((minutes < 10) ? "0" + Integer.toString(minutes) : Integer.toString(minutes));
    }
}