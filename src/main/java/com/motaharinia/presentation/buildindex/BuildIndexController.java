package com.motaharinia.presentation.buildindex;

import com.motaharinia.business.service.hibernatesearch.HibernateSearchService;
import com.motaharinia.msutility.json.PrimitiveResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Set;

@RestController
public class BuildIndexController {

    private final HibernateSearchService hibernateSearchService;

    @Autowired
    public BuildIndexController(HibernateSearchService hibernateSearchService) {
        this.hibernateSearchService = hibernateSearchService;
    }

    /**
     * این متد ستی از نام انتیتی ها دریافت میکند و ایندکس آنها را ایجاد میکند اگر ست خالی ارسال شود کل انتیتیها را ایندکس میکند
     * @param entitySet ستی از کلاس هایی که میخواهیم ایندکس شوند
     * @return خروجی: مقدار true برمیگرداند
     * @throws Exception این متد ممکن است اکسپشن صادر کند
     */
    @PutMapping(value = "/buildIndexRun")
    public @ResponseBody  PrimitiveResponse buildIndex(@RequestBody Set<String> entitySet) throws Exception {

        return hibernateSearchService.rebuildIndexer(entitySet);
    }
}
