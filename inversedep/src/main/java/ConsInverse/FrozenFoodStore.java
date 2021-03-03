package ConsInverse;

public class FrozenFoodStore {
    public FrozenFood createFrozenFood(String tipe, String daging){
        FrozenFood frfood = null;
        if(tipe.equals("nugget")){
            frfood = new NuggetAyam();
        }else if(tipe.equals("dimsum")){
            frfood = new DimsumAyam();
        }
        frfood.prepare();
        return frfood;
    }
}
