class Main{
    public static void main(String arg[]){
        Gun gun = new Gun(15);
        for(Integer i=0; i<10; i++){
            gun.fire();
            if(i == 5){
                gun.reload();
            }
        }
    }
}

class Gun {
    Integer ammo;
    Integer maxAmmo;
    
    Gun(Integer number) {
        System.out.println("製造されました！");
        maxAmmo = number;
        System.out.println("maxAmmo is " + maxAmmo);
        ammo = maxAmmo;
        System.out.println("ammo : " + ammo);
    }

    public void fire() {
        System.out.println("fire!");
        ammo = ammo - 1;
        System.out.println("ammo : " + ammo);
    }

    public void reload() {
        System.out.println("reload!");
        ammo = maxAmmo;
        System.out.println("ammo : " + ammo);
    }
}

