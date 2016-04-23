package enroute.dstest.test;

import org.junit.Assert;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import aQute.bnd.testing.DSTestWiring;
import dstest.api.I;
import junit.framework.TestCase;

@Component
public class DstestTest extends TestCase {

    private final BundleContext context = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
    final DSTestWiring          ds      = new DSTestWiring();

    private I i;

    public void setUp()
            throws Exception
    {
        ds.setContext( context );
        ds.add( this );
        ds.wire();
    }

    @Reference(target="(param=this_one)")
    void setI( I i )
    {
        this.i = i;
    }

    public void testSetup()
            throws Exception
    {
        Assert.assertNotNull(context);
        Assert.assertNotNull(i);
        Assert.assertEquals("C2", i.name());
    }
}
