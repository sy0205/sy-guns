package cn.stylefeng.guns.modular.manage.service.impl;

import cn.stylefeng.guns.modular.system.model.UPassport;
import cn.stylefeng.guns.modular.manage.dao.UPassportMapper;
import cn.stylefeng.guns.modular.manage.service.IUPassportService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户通行证表 服务实现类
 * </p>
 *
 * @author yu
 * @since 2018-12-19
 */
@Service
public class UPassportServiceImpl extends ServiceImpl<UPassportMapper, UPassport> implements IUPassportService {
    @Override
    public List<Map<String, Object>> selectUPassports(Object o) {
        return this.baseMapper.selectUPassports(o);
    }
}
