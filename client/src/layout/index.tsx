import { useDefineMenu } from "#layout/hook/useDefineMenu";
import { CheckOutlined } from "@ant-design/icons";
import { Input, Layout, List, Menu, Popover, theme } from "antd";
import React, { memo } from "react";
import { useTranslation } from "react-i18next";

const { Header, Content, Footer, Sider } = Layout;

const DashboardLayout = memo(({ children }: { children: React.ReactNode }) => {
  const {
    token: { colorBgContainer, borderRadiusLG },
  } = theme.useToken();

  const { items } = useDefineMenu();

  const { t, i18n } = useTranslation();

  return (
    <Layout className='h-screen'>
      <Header className='flex items-center justify-between'>
        <div className='flex items-center'>
          <span className='text-white text-2xl font-bold'>My Social</span>
        </div>
        <Input.Search
          placeholder='Search'
          onSearch={(value) => console.log(value)}
          className='w-[35%]'
        />
        <div className='flex items-center'>
          <div className=''>
            <span className='text-white ml-2'>Admin</span>
          </div>
          <div className='ml-4'>
            <Popover
              placement='bottomRight'
              content={
                <List
                  dataSource={[t("English"), t("Vietnamese")]}
                  renderItem={(item) => (
                    <List.Item
                      onClick={() =>
                        i18n.changeLanguage(item === t("English") ? "en" : "vi")
                      }
                      className='cursor-pointer hover:bg-gray-200 p-2 hover:rounded-lg'
                    >
                      <span className='text-black mr-1'>
                        {item === t("English") ? "EN" : "VI"} - {item}
                      </span>
                      {i18n.language === "en" && item === t("English") ? (
                        <CheckOutlined className='text-blue-500' />
                      ) : (
                        i18n.language === "vi" &&
                        item === t("Vietnamese") && (
                          <CheckOutlined className='text-blue-500' />
                        )
                      )}
                    </List.Item>
                  )}
                />
              }
              trigger='click'
            >
              <span className='text-white cursor-pointer'>
                {i18n.language === "en" ? t("English") : t("Vietnamese")}
              </span>
            </Popover>
          </div>
        </div>
      </Header>
      <Content className='px-[10px] py-[15px] overflow-auto'>
        <Layout
          style={{
            background: colorBgContainer,
            borderRadius: borderRadiusLG,
          }}
          className='h-full py-0'
        >
          <Sider
            style={{
              background: colorBgContainer,
              borderRadius: borderRadiusLG,
            }}
            width={200}
            className='border-r-2'
          >
            <Menu
              mode='inline'
              defaultSelectedKeys={items.map((item) =>
                location.pathname.startsWith(item.key) ? item.key : ""
              )}
              className='h-[40%] w-full'
              items={items}
              theme='light'
              style={{
                background: colorBgContainer,
                borderRadius: borderRadiusLG,
              }}
            />
            <hr />
            <div className='h-[50%] w-full'>
              <p className='text-black text-center p-2'>{t("Communities")}</p>
              <Menu
                mode='inline'
                title='Community'
                className='h-[50%] w-full'
                theme='light'
              />
            </div>
          </Sider>
          <Content className='overflow-auto px-0 py-6 min-h-[280px] container'>
            {children}
          </Content>
          <Sider
            style={{
              background: colorBgContainer,
              borderRadius: borderRadiusLG,
            }}
            width={200}
            className='border-l-2 rounded-lg'
          >
            
          </Sider>
        </Layout>
      </Content>
    </Layout>
  );
});

DashboardLayout.displayName = "DashboardLayout";

export default DashboardLayout;
