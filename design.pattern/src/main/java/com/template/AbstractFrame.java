package com.template;

public abstract class AbstractFrame implements  Frame{
    @Override
    public void display() {
       this.header();
       this.body();
       this.footer();
    }
    private void preBody() {
        System.out.println("[                     ]");
        System.out.println("[                     ]");
        System.out.println("[                     ]");
        System.out.println("[                     ]");
    }

    private void postBody() {
        System.out.println("[                     ]");
        System.out.println("[                     ]");
        System.out.println("[                     ]");
        System.out.println("[                     ]");
        System.out.println("[_____________________]");
    }
    protected void body(){
        preBody();
        this.bodyImage();
        postBody();
    }

    protected abstract void bodyImage();

    protected abstract void header() ;

    private void footer() {
        System.out.println("Projected By GlobelLogic");
    }
}
