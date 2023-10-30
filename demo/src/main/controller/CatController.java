@RestController
public class CatController {

    @Autowired
    private CatRepository catRepository;

    @GetMapping("api/v1/test")
    public String test() {
        catRepository.save(new Cat("test"));
        return "ok";
    }
}