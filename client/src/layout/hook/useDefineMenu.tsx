import { HomeOutlined, ProfileOutlined, SaveOutlined } from "@ant-design/icons";
import { useMemo } from "react";
import { useTranslation } from "react-i18next";
import { SlUserFollowing } from "react-icons/sl";
import { Link } from "react-router-dom";

export interface MenuItem {
  key: string;
  icon: React.ReactNode;
  children?: MenuItem[];
  label: React.ReactNode;
  permissions?: string[];
}

export function getItem(
  icon: React.ReactNode,
  key: string,
  permissions?: string[],
  label?: React.ReactNode,
  children?: MenuItem[]
): MenuItem {
  return { icon, key, children, label, permissions };
}

export const useDefineMenu = () => {
  const { t } = useTranslation("translation");

  //? Implement accessible menu items with login
  const items = useMemo(() => {
    const items: MenuItem[] = [
      getItem(
        <Link to='/home'>
          <HomeOutlined />
          <span className='ml-2'>{t("Home")}</span>
        </Link>,
        "/home"
      ),
      getItem(
        <Link to='/profile'>
          <ProfileOutlined />
          <span className='ml-2'>{t("Profile")}</span>
        </Link>,
        "/profile"
      ),
      getItem(
        <Link to='/saved'>
          <SaveOutlined />
          <span className='ml-2'>{t("Saved")}</span>
        </Link>,
        "/saved"
      ),
      getItem(
        <Link to='/following'>
          <SlUserFollowing />
          <span className='ml-2'>{t("Following")}</span>
        </Link>,
        "/following"
      ),
    ];

    return items;
  }, [t]);

  return {
    items,
  };
};
