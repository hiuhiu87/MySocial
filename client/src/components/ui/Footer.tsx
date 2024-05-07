const Footer = () => {
  return (
    <div className='flex justify-center gap-1'>
      <span>My Social © {new Date().getFullYear()} Created by</span>
      <div className='flex justify-center items-center'>
        <a
          href='https://github.com/hiuhiu87'
          target='_blank'
          rel='noreferrer'
          className='ml-1'
        >
          <img
            src='https://avatars.githubusercontent.com/u/114718657?v=4'
            alt='avatar'
            className='h-6 rounded-full'
          />
        </a>
        <a
          href='https://github.com/bcuongwf'
          target='_blank'
          rel='noreferrer'
          className='ml-1'
        >
          <img
            src='https://avatars.githubusercontent.com/u/121405290?v=4'
            alt='avatar'
            className='h-6 rounded-full'
          />
        </a>
        <a
          href='https://github.com/Nghia-Oniamey'
          target='_blank'
          rel='noreferrer'
          className='ml-1'
        >
          <img
            src='https://avatars.githubusercontent.com/u/125682339?v=4'
            alt='avatar'
            className='h-6 rounded-full'
          />
        </a>
        <a
          href='https://github.com/lucluat'
          target='_blank'
          rel='noreferrer'
          className='ml-1'
        >
          <img
            src='https://avatars.githubusercontent.com/u/133252080?v=4'
            alt='avatar'
            className='h-6 rounded-full'
          />
        </a>
      </div>
    </div>
  );
};

export default Footer;
