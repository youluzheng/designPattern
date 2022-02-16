package visitor;

import java.util.ArrayList;
import java.util.List;

public class SetMaterial {
    private List<Material> materials = new ArrayList<>();
    public void add(Material material){
        this.materials.add(material);
    }
    public void accept(Company company){
        for(var m:this.materials){
            m.accept(company);
        }
    }
}
