package dstest.provider;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import dstest.api.I;

@Component(
        name="enroute.C2",
        immediate=true, 
        property = { "param=this_one" }
)
public class C2 implements I {
    @Activate
    void activate()
    {
        System.out.println( "Activated C2" );
    }

	@Override
	public String name() {
		return "C2";
	}
}
