package ku.cs.kafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "\n" +
                "ร้านหมูกะทะชื่อร้านสุดยอดยากิอยากจะมีส่งแบบ Delivery ที่ลูกค้าสามารถเข้ามาสั่งอาหารที่เว็บไซด์ " +
                "ลูกค้าจะต้องสมัครสมาชิกกับทางร้านผ่านเว็บไซด์โดยที่การสั่งแต่ละครั้งจะได้สะสมแต้ม ลูกค้าจะต้องเลือกอาหารให้ครบ300บาทถึงจะสั่งได้ " +
                "โดยที่ค่าส่งอยู่ที่ครั้งละ50บาท แต่ถ้าสั่งเกิน1000บาทส่งฟรี โดยที่เว็บไซด์นั้นง่ายต่อการใช้งานของลูกค้า มีเมนูแยกเป็นแต่ละหมวด " +
                "เช่นของสด ของทานเล่น เครื่องดื่นเป็นต้น \n");
        // ต้องคืนค่าเป็นชื่อไฟล์ html template โดยในเมธอดนี้ คืนค่าเป็น home.html
        return "home";
    }
}
