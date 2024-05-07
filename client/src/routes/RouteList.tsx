import HashLoading from "#components/ui/HashLoading";
import DashboardLayout from "#layout/index";
import { Suspense } from "react";
import { Navigate, useRoutes } from "react-router-dom";

type RouteType = {
  path: string;
  element: React.ReactNode;
  children?: RouteType[];
};

const withDashboard = (Component: React.ReactNode) => {
  return (
    <DashboardLayout>
      <Suspense fallback={<HashLoading />}>{Component}</Suspense>
    </DashboardLayout>
  );
};

const RouteList = () => {
  const routes: RouteType[] = [
    {
      path: "/",
      element: <Navigate to='/home' />,
    },
    {
      path: "/home",
      element: withDashboard(<></>),
    },
    {
      path: "/profile",
      element: withDashboard(<div>profile</div>),
    },
    {
      path: "/saved",
      element: withDashboard(<div>save</div>),
    },
    {
      path: "/following",
      element: withDashboard(<div>follow</div>),
    },
  ];

  return useRoutes(routes);
};

export default RouteList;
