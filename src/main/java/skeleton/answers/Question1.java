package skeleton.answers;

import java.util.Arrays;

public class Question1 {

    public static double calculateTotalPayment(double initialLevelOfDebt, double interestPercentage, double repaymentPercentage) {
        return Math.round(initialLevelOfDebt / 10d + calculateTotalPayment(
            initialLevelOfDebt,
            interestPercentage / 100d + 1,
            initialLevelOfDebt / 100d * repaymentPercentage,
            0));
    }

    private static double calculateTotalPayment(double debt, double intPct, double repayVal, double month) {
        //System.out.println(Arrays.asList(debt, intPct, repayVal, month));
        return debt < repayVal ? month * repayVal + debt
            : calculateTotalPayment(debt * intPct - repayVal, intPct, repayVal, month + 1);
    }

    public static void main(String[] args) {
        double result;
        result = calculateTotalPayment(962.3967577039542,4.664795277139649,14.233004676691777);
        System.out.println("Expected:1286.0 | Result:" + result + " = " + (1286.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(672.1811125903685,0.36779936704624105,18.146339035173796);
        System.out.println("Expected:747.0 | Result:" + result + " = " + (747.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(39.38851204510813,8.173884308208793,17.01799243147917);
        System.out.println("Expected:60.0 | Result:" + result + " = " + (60.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(136.41144557918898,3.5507571384994607,19.93179492320347);
        System.out.println("Expected:166.0 | Result:" + result + " = " + (166.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(780.6762141708925,6.168162671774233,18.862354348911428);
        System.out.println("Expected:1048.0 | Result:" + result + " = " + (1048.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(981.506684405727,8.871535140582237,15.498778383405037);
        System.out.println("Expected:1606.0 | Result:" + result + " = " + (1606.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(80.87750196896211,2.511056879648333,16.56049262393153);
        System.out.println("Expected:97.0 | Result:" + result + " = " + (97.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(123.58584787780093,5.39788981678772,11.255993068205521);
        System.out.println("Expected:185.0 | Result:" + result + " = " + (185.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(599.7059442750817,7.522788408024087,16.975048642434224);
        System.out.println("Expected:874.0 | Result:" + result + " = " + (874.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(405.7522462736069,4.086395593070149,17.26853221116267);
        System.out.println("Expected:511.0 | Result:" + result + " = " + (511.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(48.67298310665121,7.405548917703339,18.85066081831964);
        System.out.println("Expected:68.0 | Result:" + result + " = " + (68.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(292.10478738850713,6.104502208310056,14.593420758807785);
        System.out.println("Expected:419.0 | Result:" + result + " = " + (419.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(652.814064578322,5.028420239887315,14.37785600893938);
        System.out.println("Expected:886.0 | Result:" + result + " = " + (886.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(811.0737000226868,9.362212906625638,11.732158432612039);
        System.out.println("Expected:1775.0 | Result:" + result + " = " + (1775.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(132.11610197275996,9.294461191619641,17.566381399091327);
        System.out.println("Expected:209.0 | Result:" + result + " = " + (209.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(131.9375667939326,5.3311138359267165,18.154763467450707);
        System.out.println("Expected:173.0 | Result:" + result + " = " + (173.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(238.18913171749008,6.372089998456556,17.7976234414509);
        System.out.println("Expected:328.0 | Result:" + result + " = " + (328.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(936.3282168062451,5.43576142241595,19.052806500575);
        System.out.println("Expected:1224.0 | Result:" + result + " = " + (1224.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(608.7054021101684,9.646706519909548,11.66369051358818);
        System.out.println("Expected:1407.0 | Result:" + result + " = " + (1407.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(963.2955847401265,8.089785087282127,18.43622706015837);
        System.out.println("Expected:1411.0 | Result:" + result + " = " + (1411.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(89.07849031564055,5.303508078467845,12.295061587267787);
        System.out.println("Expected:128.0 | Result:" + result + " = " + (128.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(742.8457835586078,4.851811421395264,13.238520543294825);
        System.out.println("Expected:1019.0 | Result:" + result + " = " + (1019.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(985.8828314612939,3.576425347412441,19.737048060291926);
        System.out.println("Expected:1202.0 | Result:" + result + " = " + (1202.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(483.3191165726987,5.917430619440541,14.886036869935916);
        System.out.println("Expected:679.0 | Result:" + result + " = " + (679.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(347.69819939971933,4.2294143451379,16.88885227560623);
        System.out.println("Expected:441.0 | Result:" + result + " = " + (441.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(211.79865381574967,7.27276528637787,14.19598431009592);
        System.out.println("Expected:328.0 | Result:" + result + " = " + (328.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(77.25846998740847,6.3761722638985265,11.724508378117449);
        System.out.println("Expected:122.0 | Result:" + result + " = " + (122.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(868.3812609836351,6.097397486443899,15.014479781816314);
        System.out.println("Expected:1229.0 | Result:" + result + " = " + (1229.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(79.86796945270207,8.222122305232071,13.192048351112762);
        System.out.println("Expected:138.0 | Result:" + result + " = " + (138.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(35.212467198234364,0.5622809890935817,14.48701289666954);
        System.out.println("Expected:40.0 | Result:" + result + " = " + (40.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(4934.737185784413,3.7708721863893286,47.02669276360849);
        System.out.println("Expected:5720.0 | Result:" + result + " = " + (5720.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(7532.990683649163,3.6356106588380097,24.90718855527934);
        System.out.println("Expected:9024.0 | Result:" + result + " = " + (9024.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(1719.9461763397576,4.0118976954065895,43.79769310004647);
        System.out.println("Expected:2002.0 | Result:" + result + " = " + (2002.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(46.28458076169537,1.3483506172829356,20.979557569229474);
        System.out.println("Expected:53.0 | Result:" + result + " = " + (53.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(648.1545853638092,9.574263007822681,47.89490192005351);
        System.out.println("Expected:813.0 | Result:" + result + " = " + (813.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(4489.518414287626,3.8567133467471204,16.945575101740445);
        System.out.println("Expected:5619.0 | Result:" + result + " = " + (5619.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(4730.9351332956485,3.256913208636656,16.007890778005315);
        System.out.println("Expected:5847.0 | Result:" + result + " = " + (5847.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(5250.752161148513,0.2580232014735816,33.989849653533426);
        System.out.println("Expected:5798.0 | Result:" + result + " = " + (5798.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(9223.627928921402,8.418432084295567,27.93885203158227);
        System.out.println("Expected:12290.0 | Result:" + result + " = " + (12290.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(5340.8973985001585,8.041993506039816,15.564752169916058);
        System.out.println("Expected:8331.0 | Result:" + result + " = " + (8331.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(202871.5034496027,9.840917875930263,82.14644965936417);
        System.out.println("Expected:243123.0 | Result:" + result + " = " + (243123.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(562891.5107680552,3.6448287618910715,25.819116549080398);
        System.out.println("Expected:673281.0 | Result:" + result + " = " + (673281.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(267035.4291746342,0.8484722033295089,39.93918503329479);
        System.out.println("Expected:297385.0 | Result:" + result + " = " + (297385.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(941292.5652335682,5.640475870024355,88.8721079620954);
        System.out.println("Expected:1088515.0 | Result:" + result + " = " + (1088515.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(324119.30417937133,2.8235140803665564,19.685657367971142);
        System.out.println("Expected:386416.0 | Result:" + result + " = " + (386416.0 == result ? "CORRECT" : "NOPE"));
        result = calculateTotalPayment(265540.192422397,5.085113559899033,96.98780539460112);
        System.out.println("Expected:305597.0 | Result:" + result + " = " + (305597.0 == result ? "CORRECT" : "NOPE"));
    }
}
