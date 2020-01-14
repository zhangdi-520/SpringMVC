package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;


public class HomeControllerTest {

    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
       //assertEquals("home",controller.home());
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/ok")).andExpect(view().name("home"));
    }


}
