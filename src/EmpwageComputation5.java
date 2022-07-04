public class EmpwageComputation5 {
    public static void main(String args[]) {
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours = 0;
        final int WORKING_DAYS = 20;
        int totalWage = 0;

        for (int day = 1; day <= WORKING_DAYS; day++)

       // switch (empType) {
//           final int WORKING_DAYS = 20;
//            int totalWage = 0;
//            for (int day = 1; day <= WORKING_DAYS; day++)

//                case FULL_TIME:
//            System.out.println("Employee is Present Full time");
//            workingHours = 8;
//            break;
//            case PART_TIME:
//                System.out.println("Employee is Present Part time");
//                workingHours = 4;
//                break;
//            default:
//                System.out.println("Employee is Absent");
//                int empType = (int) (Math.random() * 100) % 3;
//                int workingHours = 0;
               switch (empType)
                {
                   case FULL_TIME:
                        workingHours = 8;
                        break;
                    case PART_TIME:
                        workingHours = 4;
                        break;
                    default:
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Day " + day + " wage is:" + wage);
        totalWage += wage;
    }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
        System.out.println("Total wage for a month is " + totalWage);
    }



