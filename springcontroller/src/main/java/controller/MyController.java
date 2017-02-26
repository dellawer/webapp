package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class MyController {

    @RequestMapping(value = "/test/event/add", method = RequestMethod.POST)
    @ResponseBody
    public String test() {
        return "Test";
        }

    @RequestMapping(value = "/test/event/get/fromDate/{fromDate}/toDate/{toDate}")
    @ResponseBody
    public List<Event> test2(@PathVariable (value ="fromDate") Long fromDate,
                        @PathVariable (value ="toDate") Long toDate) throws Exception{


        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }


        Event event = new Event();
        event.setId(0);
        event.setDate(new Date());
        event.setMembers(new String("Kolya,Vasya,Pasha"));
        event.setDescription(new String("Privet!"));
        event.setEvent(new String("title event"));

        List events = new ArrayList<Event>();
        events.add(event);

        return events;
        }

    @ResponseBody
    @ExceptionHandler(MyException.class)
    public MyJsonError handleEmployeeNotFoundException(){

        MyJsonError error1 = new MyJsonError();
        error1.setCode("exception");
        error1.setDescription("url");

        return error1;
    }


}
