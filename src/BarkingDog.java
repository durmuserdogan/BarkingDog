public class BarkingDog {
    public static boolean shouldWakeUp(boolean barkingDog, int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23){
            return false;
        }
        else if(barkingDog && (hourOfDay<8 || hourOfDay>22)){
            return true;
        }
        else{
            return false;
        }
    }
}
