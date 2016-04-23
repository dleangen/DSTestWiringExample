package dstest.provider;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import dstest.api.I;

@Component(
        name="enroute.C3",
        immediate=true, 
        property = { "param=ignore" }
)
public class C3 implements I {
    @Activate
    void activate()
    {
        System.out.println( "Activated C3" );
    }

	@Override
	public String name() {
		return "C3";
	}
}
