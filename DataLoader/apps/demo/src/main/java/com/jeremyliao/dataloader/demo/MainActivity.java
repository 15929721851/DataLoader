package com.jeremyliao.dataloader.demo;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.jeremyliao.dataloader.core.DataLoader;
import com.jeremyliao.dataloader.core.source.DataSource;
import com.jeremyliao.dataloader.core.utils.GenericsUtils;
import com.jeremyliao.dataloader.demo.bean.CommonParam;
import com.jeremyliao.dataloader.demo.bean.CommonResult;
import com.jeremyliao.dataloader.demo.bean.DemoParam;
import com.jeremyliao.dataloader.demo.bean.DemoResult;
import com.jeremyliao.dataloader.demo.dataload.DemoDataSource;

public class MainActivity extends AppCompatActivity {

    private static final String[] COMMON_PARAMS = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testLoadData1(View view) {
        DataSource<String> dataSource = DataLoader.get(DemoDataSource.class).getData1(COMMON_PARAMS[0]);
        dataSource.result().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData2(View view) {
        DemoParam param = new DemoParam();
        param.name = COMMON_PARAMS[0];
        param.no = 100;
        DataSource<DemoResult> dataSource = DataLoader.get(DemoDataSource.class).getData2(param);
        dataSource.result().observe(this, new Observer<DemoResult>() {
            @Override
            public void onChanged(@Nullable DemoResult s) {
                Toast.makeText(MainActivity.this, s.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData3(View view) {
        CommonParam<String> param = new CommonParam<>();
        param.param = COMMON_PARAMS[0];
        DataSource<CommonResult<String>> dataSource = DataLoader.get(DemoDataSource.class).getData3(param);
        dataSource.result().observe(this, new Observer<CommonResult<String>>() {
            @Override
            public void onChanged(@Nullable CommonResult<String> result) {
                Toast.makeText(MainActivity.this, result.data, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData4(View view) {
        DataSource<String> dataSource = DataLoader.get(DemoDataSource.class).getData4(COMMON_PARAMS[0]);
        dataSource.result().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData5(View view) {
        CommonParam<String> param = new CommonParam<>();
        param.param = COMMON_PARAMS[0];
        DataSource<CommonResult<String>> dataSource = DataLoader.get(DemoDataSource.class).getData5(param);
        dataSource.result().observe(this, new Observer<CommonResult<String>>() {
            @Override
            public void onChanged(@Nullable CommonResult<String> result) {
                Toast.makeText(MainActivity.this, result.data, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData6(View view) {
        DataSource<String> dataSource = DataLoader.get(DemoDataSource.class).getData6();
        dataSource.result().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String result) {
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData7(View view) {
        DataSource<String> dataSource = DataLoader.get(DemoDataSource.class).getData7(COMMON_PARAMS[0], COMMON_PARAMS[1]);
        dataSource.result().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String result) {
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData8(View view) {
        DataSource<String> dataSource = DataLoader.get(DemoDataSource.class).getData8(COMMON_PARAMS[0], COMMON_PARAMS[1], COMMON_PARAMS[2]);
        dataSource.result().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String result) {
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData9(View view) {
        DataSource<String> dataSource = DataLoader.get(DemoDataSource.class).getData9(COMMON_PARAMS[0], COMMON_PARAMS[1], COMMON_PARAMS[2], COMMON_PARAMS[3]);
        dataSource.result().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String result) {
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData10(View view) {
        DataSource<String> dataSource = DataLoader.get(DemoDataSource.class).getData10(COMMON_PARAMS[0], COMMON_PARAMS[1]);
        dataSource.result().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String result) {
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData11(View view) {
        DataSource<String> dataSource = DataLoader.get(DemoDataSource.class).getData11();
        dataSource.result().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String result) {
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData12(View view) {
        DataSource<String> dataSource = DataLoader.get(DemoDataSource.class).getData12(COMMON_PARAMS[0], COMMON_PARAMS[1]);
        dataSource.result().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String result) {
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData13(View view) {
        DataSource<String> dataSource = DataLoader.get(DemoDataSource.class).getData13(COMMON_PARAMS[0], COMMON_PARAMS[1], COMMON_PARAMS[2]);
        dataSource.result().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String result) {
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData14(View view) {
        DataSource<String> dataSource = DataLoader.get(DemoDataSource.class).getData14(COMMON_PARAMS[0], COMMON_PARAMS[1], COMMON_PARAMS[2], COMMON_PARAMS[3]);
        dataSource.result().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String result) {
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void testLoadData15(View view) {
        DataSource<String> dataSource = DataLoader.get(DemoDataSource.class).getData15();
        dataSource.result().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String result) {
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
        dataSource.error().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(@Nullable Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
