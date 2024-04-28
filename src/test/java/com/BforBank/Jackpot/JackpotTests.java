package com.BforBank.Jackpot;

import com.BforBank.Jackpot.controller.CustomerController;
import com.BforBank.Jackpot.service.JackpotService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class JackpotTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetCustomer() throws Exception{
        mockMvc.perform(get("/customer/2")).andExpect(status().isOk()).andExpect(jsonPath("lastname", is("HOCHON")));
    }
    @Test
    public void testGetCustomerNotExisting() throws Exception{
        mockMvc.perform(get("/customer/6")).andExpect(status().isNotFound());
    }

    @Test
    public void testJackpotCheckoutKOandAmountKO() throws Exception{
        mockMvc.perform(get("/customer/1/isUnlocked")).andExpect(status().isOk()).andExpect(jsonPath("unlocked", is(false)));
    }
    @Test
    public void testJackpotCheckoutOKandAmountKO() throws Exception{
        mockMvc.perform(get("/customer/2/isUnlocked")).andExpect(status().isOk()).andExpect(jsonPath("unlocked", is(false)));
    }
    @Test
    public void testJackpotCheckoutOKandAmountOK() throws Exception{
        mockMvc.perform(get("/customer/3/isUnlocked")).andExpect(status().isOk()).andExpect(jsonPath("unlocked", is(true)));
    }
    @Test
    public void testJackpotCheckoutKOandAmountOK() throws Exception{
        mockMvc.perform(get("/customer/4/isUnlocked")).andExpect(status().isOk()).andExpect(jsonPath("unlocked", is(false)));
    }


}
