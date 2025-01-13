
public class OTPGeneratorUsingMethod {

    public static void main(String[] args) {
        // Generate and validate OTP numbers
        boolean result = validateOTP();
        if (result) {
            System.out.println("All OTPs generated are unique.");
        } else {
            System.out.println("Some OTPs are duplicates.");
        }
    }

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generates a 6-digit OTP
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean validateOTP() {
        int[] otpArray = new int[10]; // Array to store the 10 OTPs
        for (int i = 0; i < 10; i++) {
            int otp = generateOTP();
            // Check if the OTP already exists in the array
            for (int j = 0; j < i; j++) {
                if (otpArray[j] == otp) {
                    return false; // Duplicate found
                }
            }
            otpArray[i] = otp; // Store the OTP in the array
        }
        return true; // All OTPs are unique
    }
}

