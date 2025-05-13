package ej6;

import java.util.ArrayList;
import java.util.List;

class Empresa {
    private String nombreComercial;
    private List<Web> webs;

    public Empresa(String nombreComercial) {
        this.nombreComercial = nombreComercial;
        this.webs = new ArrayList<>();
        this.webs.add(new Web("pagina-web-obligatoria.com"));
    }

    public void lanzarCampañaPublicitaria() {
        System.out.println("La empresa " + nombreComercial + " ha lanzado una campaña publicitaria.");
    }

    public void agregarWeb(Web web) {
        if (webs == null) {
            webs = new ArrayList<>();
        }
        this.webs.add(web);
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public List<Web> getWebs() {
        return webs;
    }
}