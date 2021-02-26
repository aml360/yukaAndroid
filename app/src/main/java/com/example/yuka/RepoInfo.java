package com.example.yuka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepoInfo {
    private static RepoInfo repo = new RepoInfo();
    private HashMap<Integer, InformacionNutricional> infos = new HashMap<>();
    public static RepoInfo getInstance() {
        return repo;
    }

    private RepoInfo(){
        int x=0;
        //1
        saveProducto(new InformacionNutricional(x,"2.33","233","56.2","2.8","9.6"));
        x++;
        //2
        saveProducto(new InformacionNutricional(x,"4.33","525","5.23","6.2","52"));
        x++;
        //3
        saveProducto(new InformacionNutricional(x,"9.66","723.6","12.5","3.9","39"));
        x++;
        //4
        saveProducto(new InformacionNutricional(x,"89.2","456","52.2","67.5","23.4"));
        x++;
        //5
        saveProducto(new InformacionNutricional(x,"7.9","569","33.5","63","52.2"));
        x++;
        //6
        saveProducto(new InformacionNutricional(x,"41.3","6333.2","58.9","2","98"));
        x++;
        //7
        saveProducto(new InformacionNutricional(x,"89","255","22","55","66"));
        x++;
        //8
        saveProducto((new InformacionNutricional(x,"0.9","8888.36","54.2","8","63")));
        x++;
        //9
        saveProducto(new InformacionNutricional(x,"28","547","32.1","69.3","2888"));
        x++;
        //10
        saveProducto(new InformacionNutricional(x,"8.3","2123","33","2.78","94.1"));
        x++;
        //11
        saveProducto(new InformacionNutricional(x,"2.33","233","56.2","2.8","9.6"));
        x++;
        //12
        saveProducto(new InformacionNutricional(x,"4.33","525","5.23","6.2","52"));
        x++;
        //13
        saveProducto(new InformacionNutricional(x,"9.66","723.6","12.5","3.9","39"));
        x++;
        //14
        saveProducto(new InformacionNutricional(x,"89.2","456","52.2","67.5","23.4"));
        x++;
        //15
        saveProducto(new InformacionNutricional(x,"7.9","569","33.5","63","52.2"));
        x++;
        //16
        saveProducto(new InformacionNutricional(x,"41.3","6333.2","58.9","2","98"));
        x++;
        //17
        saveProducto(new InformacionNutricional(x,"89","255","22","55","66"));
        x++;
        //18
        saveProducto((new InformacionNutricional(x,"0.9","8888.36","54.2","8","63")));
        x++;
        //19
        saveProducto(new InformacionNutricional(x,"28","547","32.1","69.3","2888"));
        x++;
        //20
        saveProducto(new InformacionNutricional(x,"8.3","2123","33","2.78","94.1"));
        x++;
        //21
        saveProducto(new InformacionNutricional(x,"2.33","233","56.2","2.8","9.6"));
        x++;
        //22
        saveProducto(new InformacionNutricional(x,"4.33","525","5.23","6.2","52"));
        x++;
        //23
        saveProducto(new InformacionNutricional(x,"9.66","723.6","12.5","3.9","39"));
        x++;
        //24
        saveProducto(new InformacionNutricional(x,"89.2","456","52.2","67.5","23.4"));
        x++;
        //25
        saveProducto(new InformacionNutricional(x,"7.9","569","33.5","63","52.2"));
        x++;
        //26
        saveProducto(new InformacionNutricional(x,"41.3","6333.2","58.9","2","98"));
        x++;
        //27
        saveProducto(new InformacionNutricional(x,"89","255","22","55","66"));
        x++;
        //28
        saveProducto((new InformacionNutricional(x,"0.9","8888.36","54.2","8","63")));
        x++;
        //29
        saveProducto(new InformacionNutricional(x,"28","547","32.1","69.3","2888"));
        x++;
        //30
        saveProducto(new InformacionNutricional(x,"8.3","2123","33","2.78","94.1"));



    }
    private void saveProducto(InformacionNutricional laInfo) {
        infos.put(laInfo.getId(), laInfo);
    }
    public List<InformacionNutricional> getProducto() {
        return new ArrayList<>(infos.values());
    }

}
