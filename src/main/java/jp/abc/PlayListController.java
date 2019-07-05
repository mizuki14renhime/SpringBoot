package jp.abc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlayListController {

    @RequestMapping("/playlist")
    public ModelAndView list(ModelAndView mav) {
        mav.setViewName("playlist");
        PlayList pl = new PlayList();
        mav.addObject("formModel", pl);
        return mav;
    }

}
