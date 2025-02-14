package cab_platform_lld.pojos;

import cab_platform_lld.pojos.location.ILocation;

public class Person {

    String name;
    ILocation location;


    Person(String name, ILocation location) {
        this.name = name;
        this.location = location;
    }

}
