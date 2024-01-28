import AuthLayout from './_auth/AuthLayout';
import SinginForm from './_auth/form/SinginForm';
import SingupForm from './_auth/form/SingupForm';
import RootLayout from './_root/RootLayout';
import { Home } from './_root/pages';
import './globals.css';
import { Routes , Route } from 'react-router-dom';

import { Toaster } from "@/components/ui/toaster"


const App = () => {
    return (
      <main className='flex h-screen'> 
        <Routes>
          <Route element={<AuthLayout />}>
            <Route path='/sing-in' element={<SinginForm />} />
            <Route path='/sing-up' element={<SingupForm />} />
          </Route>
          <Route element={<RootLayout />}>
            <Route index element={<Home />} />
          </Route>
        </Routes>
        <Toaster />
      </main>
    )
}

export default App





