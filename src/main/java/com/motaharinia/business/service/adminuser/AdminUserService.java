package com.motaharinia.business.service.adminuser;

import com.motaharinia.msutility.customexception.BusinessException;
import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msjpautility.search.data.SearchDataModel;
import com.motaharinia.msjpautility.search.filter.SearchFilterModel;
import com.motaharinia.presentation.adminuser.AdminUserModel;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 *  اینترفیس مدیریت ادمین ها
 */
public interface AdminUserService {
    /**
     * متد ثبت
     *
     * @param adminUserModel مدل ثبت
     * @return خروجی: مدل ثبت حاوی شناسه
     */
    @NotNull
    AdminUserModel create(@NotNull  AdminUserModel adminUserModel) throws Exception;

    /**
     * متد جستجوی با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل جستجو شده
     */
    @NotNull
    AdminUserModel readById(@NotNull Integer id) throws UtilityException;

    /**
     * متد جستجو با مدل فیلتر جستجو
     *
     * @param searchFilterModel        مدل فیلتر جستجو
     * @param searchViewTypeInterface        کلاس اینترفیس نوع نمایش خروجی که ستونهای(فیلدهای) خروجی داخل آن تعریف شده است
     * @param searchValueList لیست مقادیر مورد نیاز جهت جستجو
     * @return خروجی: مدل داده جستجو
     * @throws UtilityException
     */
    @NotNull
    SearchDataModel readGrid(@NotNull SearchFilterModel searchFilterModel, @NotNull Class searchViewTypeInterface, @NotNull List<Object> searchValueList) throws UtilityException;


    /**
     * متد ویرایش
     *
     * @param adminUserModel مدل ویرایش
     * @return خروجی: مدل ویرایش شده
     */
    @NotNull
    AdminUserModel update(@NotNull AdminUserModel adminUserModel) throws Exception;

    /**
     * متد حذف با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل حذف شده
     */
    @NotNull
    AdminUserModel delete(@NotNull Integer id) throws UtilityException;

    /**
     *  این متد نام را از ورودی دریافت میکند ولیستی از شناسه های جستجو شده را برمی گرداند
     * @param name نام
     * @return خروجی: لیستی از شناسه های جستجو شده
     * @throws Exception این متد ممکن است اکسپشن صادر کند
     */
    List<Integer> hchFindByName(String name) throws Exception;

    /**
     * این متد شناسه جنسیت را از ورودی دریافت میکند ولیستی از شناسه های جستجو شده را برمی گرداند
     * @param genderId شناسه جنسیت
     * @return خروجی: لیستی از شناسه های جستجو شده
     * @throws Exception این متد ممکن است اکسپشن صادر کند
     */
    List<Integer> hchFindByGender(Integer genderId) throws Exception;

    List<Integer> hchFindBySkill(String skillTitle) throws Exception;

    Long hchCount() throws Exception;

    Long count();
}
