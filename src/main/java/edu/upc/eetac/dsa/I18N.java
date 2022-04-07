package edu.upc.eetac.dsa;

public class I18N {

    private static I18N instance = null;

    private I18N(){
    }
    public I18N getInstance(){
        if(instance == null)
            instance = new I18N();
        return instance;
    }
}
