package ltd.newbee.mall.controller.web;

import ltd.newbee.mall.controller.vo.NewBeeMallIndexCarouselVO;
import ltd.newbee.mall.service.NewBeeMallCarouselService;
import ltd.newbee.mall.util.PageQueryUtil;
import ltd.newbee.mall.util.ResultGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import ltd.newbee.mall.service.NewBeeMallCarouselService;
import ltd.newbee.mall.service.NewBeeMallIndexConfigService;
import ltd.newbee.mall.util.PageQueryUtil;
import ltd.newbee.mall.util.Result;
import ltd.newbee.mall.util.ResultGenerator;

import ltd.newbee.mall.result.ResponseResultBody;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/goods")
@ResponseResultBody
public class WebGoodsController {
    @Resource
    NewBeeMallCarouselService newBeeMallCarouselService;

    @PostMapping(value = "/list")
    @ResponseBody
    public String list(@RequestParam Map<String, Object> params){
        System.out.println("进入轮播图-2--");
        System.out.println(newBeeMallCarouselService.getCarouselsForIndex(2));
//        PageQueryUtil pageUtil = new PageQueryUtil(params);
        return "2222222222";
    }
}
