package Exercise6_Verifying_Interaction_Order;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class WorkFlowManagerTest {

    @Test
    public void testMethod(){
        ServiceA service = Mockito.mock(ServiceA.class);

        WorkFlowManager manager = new WorkFlowManager(service);
        manager.runWorkFlow();

        InOrder inOrder = Mockito.inOrder(service);
        inOrder.verify(service).stepOne();
        inOrder.verify(service).stepTwo();
    }
}