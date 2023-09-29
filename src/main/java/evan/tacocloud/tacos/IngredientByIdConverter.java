package evan.tacocloud.tacos;

import evan.tacocloud.tacos.data.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter<String,Ingredient> {

    private final IngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo){
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }


//    private Map<String, Ingredient> ingredientMap = new HashMap<>();

//    public IngredientByIdConverter(){
//        ingredientMap.put("FLTO",
//                new Ingredient("Flto", "Flour Tortilla", Ingredient.Type.WRAP));
//        ingredientMap.put("COTO",
//                new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP));
//        ingredientMap.put("GRBF",
//                new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN));
//        ingredientMap.put("CARN",
//                new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN));
//        ingredientMap.put("TMTO",
//                new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES));
//        ingredientMap.put("LETC",
//                new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES));
//        ingredientMap.put("CHED",
//                new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE));
//        ingredientMap.put("Jack",
//                new Ingredient("JACK", "Monterrey", Ingredient.Type.CHEESE));
//        ingredientMap.put("SLAS",
//                new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE));
//        ingredientMap.put("SRCR",
//                new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE));
//    }
//
//    @Override
//    public Ingredient convert(String id) {
//        return ingredientMap.get(id);
//    }
}
