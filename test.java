import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConverter {

    public static String convertTo24HourFormat(String inputTime) {
        try {
            // Parse the input time string
            DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
            Date date = inputFormat.parse(inputTime);

            // Format the date in 24-hour format
            DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            return outputFormat.format(date);
        } catch (ParseException e) {
            // Handle parsing exceptions
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Example usage
        String inputTime = "7:22:11PM";
        String outputTime = convertTo24HourFormat(inputTime);

        if (outputTime != null) {
            System.out.println("Input Time: " + inputTime);
            System.out.println("Output Time: " + outputTime);
        } else {
            System.out.println("Error converting time.");
        }
    }
}



Hello HR Manager,

I hope this email finds you well. My name is Meryem Lalouli, and I am a student at 1337 Khouribga with a strong background in React.js, Next.js, TypeScript, JavaScript, C++, C, and Node.js. With a proven background in effectively communicating technical concepts, I am eager to bridge communication gaps within Team 01. My passion for transforming education aligns seamlessly with 01Edu's vision, driving my motivation for this role. I aim to contribute to the team's success by ensuring clear communication, promoting inclusivity, and leveraging my interpersonal skills. Excited about applying my expertise, I look forward to enhancing collaboration and supporting Team 01's impactful work..

I am eager to apply my skills and contribute to your team.

Thank you for your time.

Best regards,
Meryem Lalouli